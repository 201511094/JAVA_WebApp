package kr.android.s33gridviewdemo02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridview);

        //어댑터를 객체 생성한 후 GridView에 등록
        //생성자 작성해야 함
        gridView.setAdapter(new ImageAdapter(this));
    }

    //BaseAdapter를 상속하여 GridView에 이미지를 보여줄 수 있는 기능을 정의
    public class ImageAdapter extends BaseAdapter {

        private Context context;
        
        //GridView에 보여주기 위해 이미지를 호출할 수 있는 이미지 식별자를 저장한 배열
        private Integer[] images = { R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary,R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary,R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary,R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary,R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary,R.drawable.austria, R.drawable.belgium, R.drawable.bulgaria,
                R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.estonia,
                R.drawable.finland, R.drawable.france, R.drawable.germany, R.drawable.greece,
                R.drawable.hungary };

        public ImageAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return images.length;   //GridView에 표시하고 싶은 데이터 개수
        }

        //GridView에 표시할 아이템을 반환
        @Override
        public Object getItem(int position) {
            return images[position];
        }

        //GridView의 position값 반환
        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //재사용할 수 있는 ImageView가 있다면 이를 재사용
            ImageView imageView = (ImageView)convertView;
            //재사용할 수 있는 ImageView가 없다면 객체를 새로 생성
            if (convertView == null) {
                imageView = new ImageView(context);
            }
            //이미지 뷰의 크기, 이미지 크기, 공백을 설정
            imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(10, 10, 10, 10);

            //배열로부터 이미지 정보를 받아서 세팅
            imageView.setImageResource(images[position]);

            return imageView;
        }
    }

}