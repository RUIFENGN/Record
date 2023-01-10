package com.example.record;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welocme);
        handler.sendEmptyMessageDelayed(0,1000);
    }
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg){
            Intent intent=new Intent(Welcome.this,MainActivity.class);
            startActivity(intent);
            finish();
            super.handleMessage(msg);
        }
    };
}
