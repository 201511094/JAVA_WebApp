package kr.android.s26externalactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = null;
        if (view.getId() == R.id.btn1) {
            //웹 페이지 표시
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));    //화면 호출, 주소
        }
        else if (view.getId() == R.id.btn2) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Seoul"));  //위도와 경도 사용 안함, 검색어는 Seoul
        }
        else if (view.getId() == R.id.btn3) {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-5678"));
        }
        else if (view.getId() == R.id.btn4) {
            intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:010-1234-5678"));
        }

        //Intent에 저장한 정보를 이용해서 앱의 특정 화면을 호출함
        startActivity(intent);
    }
}
/*  맨 처음 Activity Stack에는 MainActivity 존재,
    새로운 화면이 스택에 들어오면 이전의 화면이 보이지 않음
    화면을 호출하기 위해서 Intent가 필요하다. */