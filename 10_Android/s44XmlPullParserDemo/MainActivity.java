package kr.android.s44xmlpullparserdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView textView;
    ListView list;
    ArrayList<String> items = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        list = (ListView)findViewById(R.id.list);

        try {
            //words.xml파일을 읽어들여 XmlPullParser객체 생성
            XmlPullParser xpp = getResources().getXml(R.xml.words);

            while(xpp.getEventType() != XmlPullParser.END_DOCUMENT) {
                if (xpp.getEventType() == XmlPullParser.START_TAG) {
                    //word태그인지 확인, word태그의 값에 접근
                    if (xpp.getName().equals("words")) {
                        items.add(xpp.getAttributeValue(0));
                    }
                }
                xpp.next(); //다음 페이지
            }

        } catch(Exception e) {
            Toast.makeText(this, "실패: "+e.toString(), Toast.LENGTH_SHORT).show();
        }
        
        //ArrayAdapter를 생성해서 ListView에 등록
        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        list.setOnItemClickListener(this);
    }

    //이벤트 핸들러
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        textView.setText(items.get(position));
    }
}