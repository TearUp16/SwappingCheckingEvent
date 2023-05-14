package com.jar.swappingcheckingevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondLayout extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);

        textView = (TextView) findViewById(R.id.result);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null){
            textView.setText(extras.getString("result"));
        }
    }
}