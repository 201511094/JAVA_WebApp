package kr.android.s25intentmsgdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView)findViewById(R.id.text_second);
            //SecondActivity를 호출한 Intent를 구함
            Intent i = getIntent();
            if (i.getExtras() == null) {
                //전달된 데이터가 없음
                text.append("\n전달된 데이터가 없음");
            }
            else {
                //전달된 데이터가 있음
                //내용을 적지 않고 버튼을 눌러도 객체는 생성되므로 null이 아니라 ""이 됨
                String str = i.getStringExtra("msg");
                if ("".equals(str)) {
                    text.append("\n데이터를 입력해주세요!");
                }
                else {
                    text.append("\n"+str);
                }
        }

    }
}