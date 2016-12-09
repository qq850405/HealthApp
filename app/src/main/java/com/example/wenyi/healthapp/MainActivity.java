package com.example.wenyi.healthapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();





    }

    private void findViews() {

        //讀資料
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        bHelp =(Button) findViewById(R.id.b_help);
    }

    public void bmi(View v){
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);

        float bmi = weight/(height*height);
       // Log.d("BMI" ,String.valueOf(bmi));








    }




}
