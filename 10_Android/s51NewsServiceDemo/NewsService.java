package com.example.s51newsservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class NewsService extends Service {

    boolean mQuit;
    Handler mHandler = new Handler();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //스레드 생성
        NewsThread thread = new NewsThread();
        thread.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Service End", Toast.LENGTH_SHORT).show();
        mQuit = true;
    }

    class NewsThread extends Thread {
        String[] arNews = {
                "코로나19 확진자가 급증하여 병실 부족 현실화",
                "번데기 맛 쵸코파이 출시",
                "춘천 지역에 초거대 유전 발견",
                "한국 월드컵 결승 진출",
                "올 겨울 강력한 한파 예상",
                "롤러블 스마트폰이 내년에 출시될 것으로 기대",
                "코로나19 백신 개발 경쟁 가속화"
        };

        @Override
        public void run() {
            for (int i=0; mQuit == false; i++) {
                final int idx = i;

                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(NewsService.this, arNews[idx % arNews.length], Toast.LENGTH_LONG).show();
                    }
                });

                //지정한 시간만큼 실행을 멈춤
                try {
                    Thread.sleep(7000);

                } catch(Exception e) {
                    Log.e("NewsService", e.toString());
                }
            }
        }
    }

}
