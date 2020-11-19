package com.example.s43domdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView selection;
    ListView list;
    ArrayList<String> items = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selection = (TextView) findViewById(R.id.selection);
        list = (ListView) findViewById(R.id.list);

        //XML 파일을 읽어서 ArrayList에 등록
        InputStream in = null;

        try {
            in = getResources().openRawResource(R.raw.words);
            //DOM parser
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(in);

            NodeList words = doc.getElementsByTagName("word");

            for (int i = 0; i < words.getLength(); i++) {
                items.add(((Element) words.item(i)).getAttribute("value"));
            }

        } catch (Exception e) {
            Toast.makeText(this, "Exception: " + e.toString(), Toast.LENGTH_SHORT).show();
        } finally {
            if (in != null) try {in.close();} catch (IOException e) {}
        }

        //ArrayAdapter를 생성해서 ListView에 등록
        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items));

        //이벤트 연결
        list.setOnItemClickListener(this);
    }

    //이벤트 핸들러
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selection.setText(items.get(position));
    }
}