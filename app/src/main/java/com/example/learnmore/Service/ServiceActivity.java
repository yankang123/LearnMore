package com.example.learnmore.Service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.learnmore.R;

public class ServiceActivity extends AppCompatActivity {
private  MyService.MyBinder myBinder;
    private ServiceConnection connection =new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
           myBinder = (MyService.MyBinder)iBinder;
           myBinder.func();
           myBinder.funcTwo();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        Intent intent = new Intent(this,MyService.class);

        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startService(intent);
                bindService(intent,connection,BIND_AUTO_CREATE);//第三个参数则
                //是一个标志位，这里传入 BIND_AUTO_CREATE 表示在活动和服务进行绑定后自动创建服务。
                Toast.makeText(ServiceActivity.this,"startservice",Toast.LENGTH_LONG).show();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  stopService(intent);
                unbindService(connection);
                Toast.makeText(ServiceActivity.this,"stopservice",Toast.LENGTH_LONG).show();
            }
        });
    }
}