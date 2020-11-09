package kr.android.s02textviewdemo02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //반드시 있어야 함
        //activity_main.xml을 읽어 xml에 명시되어 있는 태그를 객체로 생성해서 화면에 View들을 구성함, 먼저 실행되어야 함
        setContentView(R.layout.activity_main);

        //activity_main.xml의 TextView태그에 명시한 ID를 통해 TextView객체를 호출
        TextView text = (TextView) findViewById(R.id.textView);

        //배경색 지정
        text.setBackgroundColor(Color.BLUE);
        //글자색 지정
        text.setTextColor(Color.WHITE);
    }
}