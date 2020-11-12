package kr.android.s25intentmsgdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.edit);
    }

    public void onClick(View view) {
        Intent i = null;
        if (view.getId() == R.id.button) {
            //그냥 이동
            i = new Intent(this, SecondActivity.class);

            //Intent를 실행시켜서 Intent에 명시된 Activity를 구동시킴
            startActivity(i);
        }
        else if (view.getId() == R.id.button2) {
            //EditText에 입력한 데이터를 갖고 이동
            String msg = edit.getText().toString();

            if ("".equals(msg)) {
                //내용이 비어있을 경우 토스트 메시지
                Toast.makeText(this, "데이터를 입력하세요!", Toast.LENGTH_SHORT).show();
            }
            else {
                i = new Intent(this, SecondActivity.class);
                i.putExtra("msg", msg);

                //Intent를 실행시켜서 Intent에 명시된 Activity를 구동시킴
                startActivity(i);
            }
        }
    }

}
/*  AndroidManifest.xml에 <activity android:name=".SecondActivity"/> 추가해야 함*/