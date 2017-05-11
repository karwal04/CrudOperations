package com.example.karwal.crudoperations;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by karwal on 21-04-2017.
 */

public class UserAdaptor extends CursorAdapter {

     public UserAdaptor(Context context, Cursor cursor){
        super(context,cursor,0);
    }


    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Lookup view for data population
        TextView tvName = (TextView) view.findViewById(R.id.name);
        TextView tvHome = (TextView) view.findViewById(R.id.phone_no);
        TextView date = (TextView) view.findViewById(R.id.Date_list);
        TextView time = (TextView) view.findViewById(R.id.time_list);
        // Populate the data into the template view using the data object
        String name=cursor.getString(cursor.getColumnIndexOrThrow("name"));
        String phoneno=cursor.getString(cursor.getColumnIndexOrThrow("phone_number"));
        String date_data=cursor.getString(cursor.getColumnIndexOrThrow("date"));
        String time_data=cursor.getString(cursor.getColumnIndexOrThrow("time"));

        tvName.setText(name);
        tvHome.setText(phoneno);
        date.setText(date_data);
        time.setText(time_data);
        // Return the completed view to render on screen
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }
}
