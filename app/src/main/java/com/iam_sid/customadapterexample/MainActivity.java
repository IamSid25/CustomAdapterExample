package com.iam_sid.customadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
    ArrayList<product> itemArray=new ArrayList<product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         for(int item=0;item<=2;item++)
         {
            itemArray.add(new product(R.mipmap.ic_launcher,"samsung"+item,"10 MP"+item));
         }

         lv=(ListView)findViewById(R.id.lvMobiles);

         lv.setAdapter(new customAdapter(itemArray,this));
    }

}
