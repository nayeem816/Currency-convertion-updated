package com.example.diu.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout r1;
    Button b1,b2;
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome",Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, SecondClass.class);
                startActivity(i);
            }
        });
        r1 = (RelativeLayout) findViewById(R.id.activity_main);
        b2 = (Button) findViewById(R.id.c);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    r1.setBackgroundResource(R.drawable.a);
                    flag=1;
                }
                else if(flag==1){
                    r1.setBackgroundResource(R.drawable.b);
                    flag=0;
                }
            }
        });
    }
}
