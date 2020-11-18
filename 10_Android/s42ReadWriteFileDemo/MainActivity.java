package kr.android.s42readwritefiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.OnAccountsUpdateListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private final static String NOTES = "notes.txt";
    private EditText editor;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editor = (EditText)findViewById(R.id.editor);
        btn = (Button)findViewById(R.id.close);

        //이벤트 연결
        btn.setOnClickListener(new View.OnClickListener(){
            //이벤트 핸들러
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //파일의 내용 읽기
        BufferedReader reader = null;
        try {
            InputStream in = openFileInput(NOTES);
            if (in != null) {
            reader = new BufferedReader(new InputStreamReader(in));
            String str;
            StringBuffer buf = new StringBuffer();

            while((str = reader.readLine()) != null) {
                buf.append(str + "\n");
            }
             //읽어들인 내용을 EditText에 저장
                editor.setText(buf.toString());
            }

        } catch(FileNotFoundException e) {
            //최초에 파일이 없을 때 호출되었기 때문에 발생한 예외
            //파일이 생성된 후에는 발생하지 않음
        } catch(Exception e) {
            Toast.makeText(this, "예외: " + e.toString(), Toast.LENGTH_SHORT).show();
        } finally {
            //자원정리
            if (reader != null) try {reader.close();} catch(IOException e) {}
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        //파일을 생성하고 파일에 내용을 저장
        OutputStreamWriter out = null;
        try {
            //openFileOutput : 내장영역에 파일을 생성
            //MODE_PRIVATE : 덮어쓰기, MODE_APPEND : 이어쓰기
            out = new OutputStreamWriter(openFileOutput(NOTES, MODE_PRIVATE));
            Toast.makeText(this, "데이터를 저장합니다!", Toast.LENGTH_SHORT).show();
            
        } catch (Exception e){
            Toast.makeText(this, "예외: " + e.toString(), Toast.LENGTH_SHORT).show();
        } finally {
            //자원정리
            if (out != null) try {out.close();} catch(IOException e) {}
        }
    }
}