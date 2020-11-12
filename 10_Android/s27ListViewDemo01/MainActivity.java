package kr.android.s27listviewdemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView .OnItemClickListener {

    TextView textView;
                ListView listView;  //데이터 저장소가 필요 ex) 데이터베이스, 파일, 배열, ArrayList 등
        String[] items = {"서울", "부산", "대구", "광주", "대전", "인천", "수원",
                "원주", "강릉", "속초", "춘천", "안산", "여수", "포항", "울산", "일산", "고양"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = (TextView)findViewById(R.id.textView);
        listView = (ListView)findViewById(R.id.listView);

        //어댑터 생성, 어댑터가 중간 매개 역할을 함
        //ArrayAdapter의 인자: 자기 자신(this는 메인액티비티), 상수값(문자열을 표시하는 뷰), 배열(저장소)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        //ListView에 어댑터 지정
        listView.setAdapter(adapter);

        //이벤트 연결, this는 메인액티비티
        listView.setOnItemClickListener(this);
    }

    //이벤트 핸들러
    @Override
    //position: 위치 정보, 0부터 시작
    //id: 후에 PK로 사용됨
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        textView.setText(items[position]);
    }
}