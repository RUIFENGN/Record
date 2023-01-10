package com.example.record;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();
    }

    private void showTime(){
        TextView year = findViewById(R.id.year);
        TextView month = findViewById(R.id.month);

        SimpleDateFormat fm_y = new SimpleDateFormat("yyyy");
        SimpleDateFormat fm_m_d = new SimpleDateFormat("MMM:d");

        Date curDate = new Date(System.currentTimeMillis());

        String y = fm_y.format(curDate);
        String m_d = fm_m_d.format(curDate);

        year.setText(y);
        month.setText(m_d);
    }


}