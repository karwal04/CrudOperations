package com.example.karwal.crudoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class List extends AppCompatActivity {
    DatabaseHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView list=(ListView)findViewById(R.id.list);
        handler=new DatabaseHandler(this);


        UserAdaptor userAdaptor=new UserAdaptor(this,handler.getAllContacts());
        list.setAdapter(userAdaptor);
    }
}
