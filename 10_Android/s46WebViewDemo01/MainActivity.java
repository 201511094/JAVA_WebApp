package com.example.s46webviewdemo01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);

        //1.URL 링크
        webView.loadUrl("https://m.naver.com");

        //2. 태그를 WebView에 직접 표시
        String msg = "<html><head><meta charset=\"UTF-8\"></head><body>Hello World!</body></html>";
        //webView.loadData(msg, "text/html", "UTF-8");

        //3. 내장되어 있는 HTML을 읽어서 WebView에 표시하기
       // webView.loadUrl("file:///android_asset/hello.html");
        webView.getSettings().setJavaScriptEnabled(true);
        
        //자바스크립트 alert()메서드 호출 시 이벤트 연결
        //기본창
        //webView.setWebChromeClient(new WebChromeClient());

        //원하는 형태로 변경
        //webView.setWebChromeClient(new MyWebChromeClient());
    }

    //자바스크립트 alert()메서드에 매핑된 클래스
    private class MyWebChromeClient extends WebChromeClient {
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("대화상자")
                    .setMessage("안녕하세요!")
                    .setCancelable(false)
                    .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();

            result.confirm();
            return true;
        }
    }

}