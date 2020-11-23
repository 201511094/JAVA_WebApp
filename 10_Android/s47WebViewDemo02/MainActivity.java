package com.example.s47webviewdemo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);

        //링크 이벤트 연결
        webView.setWebViewClient(new MyWebClient());
        webView.loadUrl("https://m.naver.com");

    }

    //링크에 대한 이벤트 처리 클래스
    class MyWebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            //API Level 21이상에서 getUrl()메서드 호출이 가능하기 때문에
            //build.gradle에서 inSdkVersion을 21로 수정해야 함
            String url = request.getUrl().toString();
            view.loadUrl(url);
            return true;
        }
    }

}