package com.example.learnmore.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }
private MyBinder mybinder = new MyBinder();
    class  MyBinder extends Binder{
        public void func(){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100;i++){
                        try {
                            Thread.sleep(100);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        Log.d("生命周期", "run: 花花");
                    }

                }
            }).start();
            Log.d("生命周期", "func: 服务与活动绑定，服务竟敢随意调用我");
        }
        public int funcTwo(){
            Log.d("生命周期", "funcTwo: 服务与活动绑定，服务调用我，我还给他一个、" +
                    "返回类型");
            return 1;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("生命周期", "onBind: ");
        // TODO: Return the communication channel to the service.
        return mybinder;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("生命周期", "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    Log.d("哈哈","哇偶"+i);
                }
                stopSelf();
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("生命周期", "onDestroy: ");
        Toast.makeText(MyService.this,"stopservice Desdroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("生命周期", "onnbind: ");
        return super.onUnbind(intent);
    }
}