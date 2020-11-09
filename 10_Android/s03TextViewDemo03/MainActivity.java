package kr.android.s03textviewdemo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //xml에 명시하지 않고 직접 작성하는 방법, 권장하지는 않음
        //TextView객체 생성
        TextView textView = new TextView(this);
        //문자열 입력
        textView.setText("텍스트 직접 입력");
        
        //위에 생성한 View객체를 등록
        setContentView(textView);
    }
}