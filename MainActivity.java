package com.jar.swappingcheckingevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button btn1, btn2;
    String string1,string2,string3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string1 = e1.getText().toString();
                string2 = e2.getText().toString();
                e1.setText(string2);
                e2.setText(string1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(e1 == e2){
                    string3 = "SAME";
                }else{
                    string3 = "NOT THE SAME";
                }

                Intent intent = new Intent(MainActivity.this,SecondLayout.class);
                intent.putExtra("result", string3);
                startActivity(intent);
            }
        });
    }
}