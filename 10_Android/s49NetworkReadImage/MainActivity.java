package com.example.s49networkreadimage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "NetworkReadImage";
    private static final String IMAGE_URL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
    ImageView imageView;
    ProgressDialog dialog;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
    }

    //이벤트 핸들러
    public void onClick(View view) {
        //ProgressDialog 노출
        dialog = ProgressDialog.show(this, "사이트 접속 중", "이미지 로드 중", true);
        processData();
    }

    //스레드를 이용해서 서버로부터 이미지를 전달받고 UI 표시
    private void processData() {
        //스레드 생성
        new Thread() {
            @Override
            public void run() {
                Bitmap img = getRemoteImage();

                //Handler를 이용해서 읽어온 이미지를 UI에 표시
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageBitmap(img);
                        //ProgressDialog 중지
                        dialog.dismiss();
                    }
                });
            }
        }.start();
    }

    //서버에서 이미지를 읽어들여 Bitmap 타입으로 반환
    private Bitmap getRemoteImage() {
        Bitmap bitmap = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(IMAGE_URL);
            urlConnection = (HttpURLConnection)url.openConnection();

            //InputStream -> Bitmap
            bitmap = BitmapFactory.decodeStream(urlConnection.getInputStream());

        } catch(MalformedURLException e) {
            Log.e(TAG, e.toString());
        } catch(IOException e) {
            Log.e(TAG, e.toString());
        } finally{
            if (urlConnection != null) urlConnection.disconnect();
        }

        return bitmap;
    }

}

//https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png