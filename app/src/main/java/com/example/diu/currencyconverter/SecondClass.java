package com.example.diu.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class  SecondClass extends AppCompatActivity {

    TextView tv;
    RadioGroup rg;
    RadioButton rd,rd1,rd2,rd3,rd4;
    Button b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_class);
        tv = (TextView) findViewById(R.id.textview);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        rd1 = (RadioButton) findViewById(R.id.radioButton);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);
        rd3 = (RadioButton) findViewById(R.id.radioButton3);
        rd4 = (RadioButton) findViewById(R.id.radioButton4);
        b2 = (Button) findViewById(R.id.button1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText takafield = (EditText) findViewById(R.id.edittext);
                Double takaamount = Double.parseDouble(takafield.getText().toString());
                int selectedid = rg.getCheckedRadioButtonId();  //get selected radio button from radio group
                rd = (RadioButton) findViewById(selectedid);    //find the radio button by returned id
                if(rd == rd1 ){

                    Double USdollaramount = takaamount * .0120313;
                    //Toast.makeText(getApplicationContext(),dollaramount.toString()+ "dollars",Toast.LENGTH_LONG).show();
                    tv.setText(USdollaramount.toString());
                }
                else if(rd == rd2){
                    Double Cdollaramount = takaamount * .0154717;
                    //Toast.makeText(getApplicationContext(),dollaramount.toString()+ "dollars",Toast.LENGTH_LONG).show();
                    tv.setText(Cdollaramount.toString());
                }
                else if(rd == rd3){
                    Double euroamount = takaamount * .0103816;
                    //Toast.makeText(getApplicationContext(),dollaramount.toString()+ "dollars",Toast.LENGTH_LONG).show();
                    tv.setText(euroamount.toString());
                }
                else{
                    Double rupeeamount = takaamount * .781912;
                    //Toast.makeText(getApplicationContext(),dollaramount.toString()+ "dollars",Toast.LENGTH_LONG).show();
                    tv.setText(rupeeamount.toString());
                }

            }
        });
        b3 = (Button) findViewById(R.id.button2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondClass.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
