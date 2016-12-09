package com.example.wenyi.healthapp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BmiActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button bHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        findViews();
        bHelp.setOnClickListener(new View.OnClickListener(){


                                     @Override
                                     public void onClick(View v){

                                         new AlertDialog.Builder(BmiActivity.this)
                                                 .setTitle("BMI說明")
                                                 .setMessage("體痛(kg)/身高的平方(m^2)")
                                                 .setPositiveButton("OK",null)
                                                 .show();
                                     }
                                 }
        );



    }

    private void findViews() {

        //讀資料
        edWeight = (EditText) findViewById(R.id.ed_weight);
        edHeight = (EditText) findViewById(R.id.ed_height);
        bHelp =(Button) findViewById(R.id.b_help);
    }

    public void bmi(View v){



        // Log.d("BMI" ,String.valueOf(bmi));
        // Toast.makeText(this,String.valueOf(bmi),Toast.LENGTH_LONG).show();


        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("您的BMI值為"+bmi);
        builder.show();
                */
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();



        if(w.equals("") || h.equals("")) {
            new AlertDialog.Builder(this)
                    .setMessage( "請輸入數值")
                    .setTitle("bmi 運算")
                    .setPositiveButton("OK", null)
                    //.setNeutralButton("Cancel", null)
                    .show();
        }

        else{
            float weight = Float.parseFloat(w);
            float height = Float.parseFloat(h);
            float bmi = weight/(height*height);


            new AlertDialog.Builder(this)
                    .setMessage(bmi + "")
                    .setTitle("bmi 運算")
                    .setPositiveButton("OK", null)
                    .setNeutralButton("Cancel", null)
                    .show();
        }




    }




}
