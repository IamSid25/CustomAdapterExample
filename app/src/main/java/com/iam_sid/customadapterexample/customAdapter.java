package com.iam_sid.customadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {

ArrayList<product> itemArr;
Context con;
private static LayoutInflater inflater=null;

    public customAdapter(ArrayList<product> itemarr, Context context) {
        itemArr = itemarr;
        con = context;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemArr.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView mn;
        ImageView mi;
        TextView mp;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView=inflater.inflate(R.layout.list_con,null);

        final Holder holder=new Holder();
        holder.mn=(TextView)rowView.findViewById(R.id.tvName);
        holder.mi=(ImageView)rowView.findViewById(R.id.ivMobImg);
        holder.mp=(TextView)rowView.findViewById(R.id.tvMP);

        holder.mn.setText(itemArr.get(position).mobName);
        holder.mi.setImageResource(itemArr.get(position).imgId);
        holder.mp.setText(itemArr.get(position).camMP);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(con,"You clicked on "+itemArr,Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }
}
