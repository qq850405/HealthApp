package com.example.wenyi.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        String[] func ={"BMI","健康中心","飲食","最新消息","離開"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list =(ListView) findViewById(R.id.list);
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,func);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);








    }




    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {



        switch(position){
            case 0:

                startActivity(

                        new Intent(this,BmiActivity.class)
                );
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                finish();
                break;
        }

    }
}
