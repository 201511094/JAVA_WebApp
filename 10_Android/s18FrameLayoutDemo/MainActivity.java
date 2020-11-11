package kr.android.s18framelayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.img);
    }

    //이벤트 핸들러
    public void onClick(View view) {
        //VISIBLE 값은 상수 0
        if (img.getVisibility() == View.VISIBLE) {
            //이미지가 보여지고 있으면 안보이게 처리
            img.setVisibility(View.INVISIBLE);
        }
        else {
            //이미지가 안보여지고 있으면 보이게 처리
            img.setVisibility(View.VISIBLE);
        }
    }
}