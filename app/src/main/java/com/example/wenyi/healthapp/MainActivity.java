package com.example.wenyi.healthapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

        String[] func ={"BMI","健康中心","飲食","最新消息","離開"};
        int[] icons ={R.drawable.func_bmi,R.drawable.func_healthcenter,R.drawable.func_eat,R.drawable.func_news,R.drawable.func_exit};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        ListView list =(ListView) findViewById(R.id.list);
        ArrayAdapter adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,func);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        */
        GridView grid =(GridView) findViewById(R.id.grid);
        IconAdapter gAdapter =new IconAdapter();
        grid.setAdapter(gAdapter);
        grid.setOnItemClickListener(this);
    }



    class IconAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return func.length;
        }

        @Override
        public Object getItem(int position) {
            return func[position];
        }

        @Override
        public long getItemId(int position) {
            return icons[position];
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row =convertView;
                if(row == null){
                    row=getLayoutInflater().inflate(R.layout.item_row,null);
                    ImageView image =(ImageView) row.findViewById(R.id.item_image);
                    TextView text=(TextView) row.findViewById(R.id.item_text);

                    image.setImageResource(icons[position]);
                    text.setText(func[position]);
                 }
            return row;
        }
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
