package kr.android.s30listviewdemo04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    EditText newItem;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList를 생성하고 초기 데이터를 저장
        items = new ArrayList<String>();
        items.add("First");
        items.add("Second");
        items.add("Third");

        list = (ListView)findViewById(R.id.list);
        newItem = (EditText)findViewById(R.id.newItem);

        //어댑터 생성
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, items);
        //ListView에 어댑터 등록
        list.setAdapter(adapter);
        //선택 모드 지정
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }

    //이벤트 핸들러
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                String text = newItem.getText().toString();
                if (text.length() > 0) {
                    //데이터를 입력한 경우
                    items.add(0, text);
                    //ListView 갱신
                    adapter.notifyDataSetChanged();
                    //EditText 초기화
                    newItem.setText("");
                }
                else {
                    //데이터를 입력하지 않은 경우
                    Toast.makeText(this, "데이터를 입력하세요!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.del:
                SparseBooleanArray positions = list.getCheckedItemPositions();
                if (positions.size() > 0) {
                    //삭제 항목 선택
                    //지울 때 인덱스 변동이 있기 때문에 순서 중요, 데이터는 뒤에서부터 체크
                    for (int i=list.getCount()-1; i>=0; i--) {
                        if (positions.get(i)) {
                            //true면 선택된 항목 -> 지워야 함
                            //ArrayList에서 데이터 제거
                            items.remove(i);
                        }
                    }
                    //CheckBox 초기화
                    list.clearChoices();
                    //ListView 갱신
                    adapter.notifyDataSetChanged();
                }
                else {
                    //삭제 항목 미선택
                    Toast.makeText(this, "삭제할 데이터를 선택하세요!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}