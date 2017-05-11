package com.example.karwal.crudoperations;

import android.app.DialogFragment;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentNavigableMap;

public class MainActivity extends AppCompatActivity {
    DatabaseHandler handler;
    SQLiteDatabase db;
    static TextView result;
    static TextView result2;

    EditText name;
    EditText phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        handler=new DatabaseHandler(getApplicationContext());

        result=(TextView)findViewById(R.id.result);
        result2=(TextView)findViewById(R.id.result2);

        name=(EditText)findViewById(R.id.name_edit);
        phoneno=(EditText)findViewById(R.id.phone_edit);






    }

    public void showTimePickerDialog(View view){
        DialogFragment frag=new TimePickerFragment();
        frag.show(getFragmentManager(),"timepicker");
    }

    public void ShowDate(View view){
        DialogFragment frag=new DataPickerFragment();
        frag.show(getFragmentManager(),"datepicker");
    }

    public void ShowList(View view){
        Contact c1=new Contact();
        c1.set_Name(name.getText().toString());
        c1.set_phone_number(phoneno.getText().toString());
        c1.setDate(result.getText().toString());
        c1.setTime(result2.getText().toString());
        handler.addContact(c1);



        Intent intent=new Intent(this, com.example.karwal.crudoperations.List.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        name.setText("");
        phoneno.setText("");
    }
}
