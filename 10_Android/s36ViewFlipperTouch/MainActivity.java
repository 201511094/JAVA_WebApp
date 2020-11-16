package kr.android.s36viewflippertouch;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    ViewFlipper flipper;

    //터치 이벤트 발생 지점의 x좌표 저장, 좌/우
    float down_x, up_x;
    int[] imageItems;   //이미지를 담는 배열

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageItems = new int[]{R.drawable.koala, R.drawable.landscape, R.drawable.penguins};
        flipper = (ViewFlipper)findViewById(R.id.flipper);

        //반복문을 이용해서 이미지를 ViewFlipper에 추가
        for (int i:imageItems) {
            ImageView image = new ImageView(this);
            image.setImageResource(i);
            flipper.addView(image, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }

        //이벤트 연결
        flipper.setOnTouchListener(this);

    }

    //이벤트 핸들러
    @Override
    public boolean onTouch(View v, MotionEvent motionEvent) {
        //터치 이벤트가 일어난 뷰가 ViewFlipper가 아니면 return false
        if (v != flipper) {
            return false;
        }

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            //터치가 시작한 지점 x좌표 저장
            down_x = motionEvent.getX();
        }
        if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
            //터치가 끝난 지점 x좌표 저장
            up_x = motionEvent.getX();

            if (up_x < down_x) {
                //터치할 때 왼쪽 방향으로 진행
                //애니메이션 지정
                flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_in));

                flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_out));
                flipper.showNext(); //왼쪽 방향
            }
            else if (up_x > down_x) {
                //터치할 때 오른쪽 방향으로 진행
                flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_in));
                flipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_out));
                flipper.showPrevious(); //오른쪽 방향
            }
        }

        return true;
    }
}