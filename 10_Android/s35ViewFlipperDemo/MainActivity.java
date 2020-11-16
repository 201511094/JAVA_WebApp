package kr.android.s35viewflipperdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper flipper;
    Button btnPrev, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = (ViewFlipper)findViewById(R.id.flipper);
        btnPrev = (Button)findViewById(R.id.prev);
        btnNext = (Button)findViewById(R.id.next);

        //이벤트 연결
        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    //이벤트 핸들러
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next) {
            flipper.showNext();
        }
        else if (v.getId() == R.id.prev) {
            flipper.showPrevious();
        }
    }

}