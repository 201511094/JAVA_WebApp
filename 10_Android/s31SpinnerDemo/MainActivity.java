package kr.android.s31spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView textView;
    Spinner spinner;
    ArrayAdapter<String> adapter;
    String[] items={"대한민국", "미국", "중국", "일본", "네덜란드", "프랑스", "영국", "오스트리아", "호주", "캐나다"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        spinner = (Spinner)findViewById(R.id.spinner);
        //이벤트 연결
        spinner.setOnItemSelectedListener(this);

        //어댑터 생성
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

        //드롭다운 화면에 표시할 리소스 지정
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Spinner에 어댑터 등록
        spinner.setAdapter(adapter);
    }

    //이벤트 핸들러
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        textView.setText(items[position]);
    }

    //이벤트 핸들러
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        textView.setText("");
    }
}