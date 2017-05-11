package com.example.karwal.crudoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class List extends AppCompatActivity {
    DatabaseHandler handler;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView list=(ListView)findViewById(R.id.list);
        handler=new DatabaseHandler(this);


        UserAdaptor userAdaptor=new UserAdaptor(this,handler.getAllContacts());
        list.setAdapter(userAdaptor);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView name=(TextView)view.findViewById(R.id.name);

                Intent intent=new Intent(List.this,UpdateActivity.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);






            }
        });


    }
}
