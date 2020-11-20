package kr.android.s45readjsondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.textView);

        //assets폴더의 내용을 가져오기
        AssetManager assetManager = getResources().getAssets();

        try {
            //사용하고자 하는 JSON파일을 읽어서 스트림으로 반환
            AssetManager.AssetInputStream ais = (AssetManager.AssetInputStream)assetManager.open("sample.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(ais, "utf-8"));
            StringBuffer sb = new StringBuffer();
            String result = null;

            while((result=br.readLine()) != null) {
                sb.append(result);
            }

            //JSON문자열을 JSONObject로 변경해서 생성
            JSONObject jsonObject = new JSONObject(sb.toString());

            String menu = jsonObject.getString("menu");
            text.setText(menu + "\n");

            //JSONArray객체 생성
            JSONArray jsonArray = new JSONArray(jsonObject.getString("member"));
            for (int i=0; i<jsonArray.length(); i++) {
                text.append("==========\n");
                text.append(jsonArray.getJSONObject(i).getString("id") + "\n");
                text.append(jsonArray.getJSONObject(i).getString("name") + "\n");
                text.append(jsonArray.getJSONObject(i).getString("address") + "\n");
                text.append(jsonArray.getJSONObject(i).getString("job") + "\n");
            }

        } catch (Exception e) {
            Toast.makeText(this, "에러: "+e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}