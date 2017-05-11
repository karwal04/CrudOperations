package com.example.karwal.crudoperations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateActivity extends Activity {

    DatabaseHandler db;

    private int id;

    static TextView result;
    static TextView result2;

    EditText names;
    EditText phoneno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        db=new DatabaseHandler(getApplicationContext());

        result=(TextView)findViewById(R.id.result);
        result2=(TextView)findViewById(R.id.result2);

        names=(EditText)findViewById(R.id.name_edit);
        phoneno=(EditText)findViewById(R.id.phone_edit);

        Intent intent=getIntent();
        String name=intent.getExtras().getString("name");

        Contact ct=db.getContact(name);

        Log.v("Require ID", String.valueOf(ct.get_id()));

        id=ct.get_id();
        names.setText(ct.get_Name());
        phoneno.setText(ct.get_phone_number());
        result.setText(ct.getDate());
        result2.setText(ct.getTime());


    }


    public void Update(View view) {
        Contact newct=new Contact();
        newct.set_id(id);
        newct.set_Name(names.getText().toString());
        newct.set_phone_number(phoneno.getText().toString());
        newct.setDate(result.getText().toString());
        newct.setTime(result2.getText().toString());
        db.updateContact(newct);

        Intent intent=new Intent(this, com.example.karwal.crudoperations.List.class);
        startActivity(intent);
    }

    public void Delete(View view) {
        Contact newct=new Contact();
        newct.set_id(id);
        newct.set_Name(names.getText().toString());
        newct.set_phone_number(phoneno.getText().toString());
        newct.setDate(result.getText().toString());
        newct.setTime(result2.getText().toString());
        db.deleteContact(newct);

        Intent intent=new Intent(this, com.example.karwal.crudoperations.List.class);
        startActivity(intent);


    }
}
