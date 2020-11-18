package kr.android.s41actionbarcontextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView);

        //컨텍스트 메뉴를 연결할 View 인스턴스 등록
        registerForContextMenu(text);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //MenuInflater를 이용해서 xml에 정의한 메뉴 생성
        getMenuInflater().inflate(R.menu.context_menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.text_color:
                text.setTextColor(Color.RED);
                break;
            case R.id.text_back_color:
                text.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.text_basic:
                text.setTextColor(Color.BLACK);
                text.setBackgroundColor(Color.TRANSPARENT);
                break;
        }
        return super.onContextItemSelected(item);
    }

}