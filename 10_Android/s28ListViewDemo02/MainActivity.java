package kr.android.s28listviewdemo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    EditText myEditText;
    ArrayList<String> todoItems;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView)findViewById(R.id.listView);
        myEditText = (EditText)findViewById(R.id.myEditText);

        //데이터 저장소로 ArrayList를 사용하기 때문에 객체 생성
        todoItems = new ArrayList<String>();
        //어댑터 생성
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
        //ListView에 어댑터 등록
        myListView.setAdapter(adapter);
    }

    //이벤트 핸들러
    public void onClick(View view) {
        //객체는 생성됨, null이 아님
        String text = myEditText.getText().toString();
        if (text.length() > 0) {
            todoItems.add(0, text);
            //ArrayAdapter에 등록된 저장소의 변경된 데이터를 ListView에 반영시킴
            adapter.notifyDataSetChanged();
            //데이터가 정상적으로 저장되면 EditText를 초기화
            myEditText.setText("");
        }
        else {
            //토스트 알림 메시지 표시
            //각 인자는 순서대로 메인액티비티, 메시지를 표시할 뷰, 저장소
            //Toast.LENGTH_SHORT는 화면에 보여질 시간
            //show()가 있어야 화면에 보여짐
            Toast.makeText(this, "일정을 입력하세요!", Toast.LENGTH_SHORT).show();
        }
    }
}