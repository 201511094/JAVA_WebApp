package com.example.s50networkweatherdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ProgressBar;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {

    //기상청 날씨 정보
    private static final String WEATHER_URL = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
    private WebView webView;
    private ProgressBar processBar;
    private List<Forecast> list = new ArrayList<Forecast>();

    Handler h  = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //서버로부터 XML을 읽어들여 InputStream으로 반환
    private InputStream getStreamFromUrl() {
        InputStream input = null;
        try {
            URL url = new URL(WEATHER_URL);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

            input = urlConnection.getInputStream();

        } catch(Exception e) {
            Log.e("NetworkWeatherDemo", e.toString());
        }
        //스트림이 유지되어야 하기 때문에 자원정리 불가능

        return input;
    }

    //DOM 파서가 XML 정보를 읽어들여 파싱해서 Forecast에 저장
    //ArrayList에 Forecast를 저장
    public void buildForecastsByDOM(InputStream input) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(input);
            NodeList locals = doc.getElementsByTagName("local");

            for (int i=0; i<locals.getLength(); i++) {
                Element local = (Element)locals.item(i);

                Forecast forecast = new Forecast();
                //지역정보 저장
                forecast.city = local.getFirstChild().getNodeValue();
                //날씨 저장
                forecast.desc = local.getAttribute("desc");
                //온도 저장
                forecast.temp = local.getAttribute("ta");

                list.add(forecast);

            }

        } catch(Exception e) {
            Log.e("NetworkWeatherDemo", e.toString());
        }
    }

    //ArrayList에서 데이터를 반환받아 WebView에 표시
    public String generatePage() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><body><table width=100%>");
        sb.append("<tr>" +
                "<th width=30%>지역</th>" +
                "<th width=50%>날씨</th>" +
                "<th width=50%>온도</th>" +
                "</tr>");

        return sb.toString();
    }

    //날씨 정보를 담는 클래스(지역명, 날씨, 온도)
    class Forecast {
        String city;    //지역명
        String desc;    //날씨
        String temp;    //온도

        public Forecast(){}

        public Forecast(String city, String desc, String temp) {
            this.city = city;
            this.desc = desc;
            this.temp = temp;
        }

    }

}

//http://www.kma.go.kr/XML/weather/sfc_web_map.xml