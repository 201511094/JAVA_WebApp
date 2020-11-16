package kr.android.s34viewpagerdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_one, btn_two, btn_three;
    ViewPager mPager;
    int[] btn = {R.id.btn_one, R.id.btn_two, R.id.btn_three};

    //이벤트를 처리하는 익명 객체
    private View.OnClickListener myListener = new View.OnClickListener(){
        //이벤트 핸들러
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_one:
                    mPager.setCurrentItem(0);
                    break;
                case R.id.btn_two:
                    mPager.setCurrentItem(1);
                    break;
                case R.id.btn_three:
                    mPager.setCurrentItem(2);
                    break;
                case R.id.btn_yellow:
                case R.id.btn_sky:
                case R.id.btn_pink:
                    String text = ((Button)v).getText().toString();
                    //익명객체이므로 this 앞에 MainActivity를 명시해야 함
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이벤트 연결
        for (int id: btn) {
            findViewById(id).setOnClickListener(myListener);
        }
        mPager = (ViewPager)findViewById(R.id.pager);

        //ViewPager에 어댑터 등록
        mPager.setAdapter(new MyPagerAdapter(this));
    }

    //커스텀 페이지 어댑터 정의
    private class MyPagerAdapter extends PagerAdapter {

        //UI를 나타내는 XML의 정보를 읽어들여 View객체를 생성하는 역할
        LayoutInflater inflater;
        
        public MyPagerAdapter(Context c) {
            //LayoutInflater객체 생성
            inflater = LayoutInflater.from(c);
        }
        
        //현재 PagerAdapter에서 관리할 View의 개수
        @Override
        public int getCount() {
            return btn.length;
        }

        //ViewPager에서 사용할 뷰 객체 생성/등록
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View v = null;
            switch (position) {
                case 0:
                    v = inflater.inflate(R.layout.page_one, null);
                    v.findViewById(R.id.btn_yellow).setOnClickListener(myListener);
                    break;
                case 1:
                    v = inflater.inflate(R.layout.page_two, null);
                    v.findViewById(R.id.btn_sky).setOnClickListener(myListener);
                    break;
                case 2:
                    v = inflater.inflate(R.layout.page_three, null);
                    v.findViewById(R.id.btn_pink).setOnClickListener(myListener);
                    break;
            }

            //생성된 뷰 객체 등록
            ((ViewPager)container).addView(v, 0);

            return v;
        }

        //뷰 객체 삭제
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView((View)object);
        }

        //instantiateItem 메서드에서 생성한 객체를 이용할 것인지 여부
        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    }

}