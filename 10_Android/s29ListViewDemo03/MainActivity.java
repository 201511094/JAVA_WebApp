package kr.android.s29listviewdemo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    EditText edit;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //저장소를 생성하고 초기 데이터 저장
        items = new ArrayList<String>();
        items.add("First");
        items.add("Second");
        items.add("Third");

        list = (ListView)findViewById(R.id.list);
        edit = (EditText)findViewById(R.id.newItem);

        //어댑터 생성
        //single: RadioButton, multiple: CheckBox
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, items);

        //ListView에 어댑터 등록
        list.setAdapter(adapter);
        //선택 모드 지정
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }

    //이벤트 핸들러
    public void onClick(View view) {
        //view.getId()는 정수
        switch(view.getId()) {
            case R.id.add:
                String text = edit.getText().toString();
                if (text.length() > 0) {
                    items.add(0, text);
                    //ListView 갱신
                    adapter.notifyDataSetChanged();
                    //EditText 초기화
                    edit.setText("");
                }
                else {
                    Toast.makeText(this, "데이터를 입력하세요!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.del:
                int position = list.getCheckedItemPosition();   //선택한 포지션 읽어오기
                //ListView.INVALID_POSITION은 -1, 선택을 안했을 경우
                if (position != ListView.INVALID_POSITION) {
                    //삭제 항목 선택한 경우
                    items.remove(position);
                    //RadioButton 초기화
                    list.clearChoices();
                    //listView 갱신
                    adapter.notifyDataSetChanged();
                }
                else {
                    //삭제 항목 선택 안한 경우
                    Toast.makeText(this, "삭제 항목을 선택하세요!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}