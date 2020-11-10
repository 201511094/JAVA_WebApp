package kr.android.s06buttondemo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);

        //초기 시간 표시
        updateTime();
    }

    //activity_main.xml에 Button태그를 명시하고 속성으로 android:onClick="onClick"메서드를 지정
    //이벤트 핸들러
    public void onClick(View view) {
        updateTime();
    }

    //Button에 시간을 표시하는 메서드
    private void updateTime() {
        btn.setText(DateFormat.format("yyyy-MM-dd kk:mm:ss", new Date()));
    }
}