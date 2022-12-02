package com.example.androidlab_almustafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Construct the data source
    private ArrayList<Person> people = new ArrayList <Person>();
    private PeopleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create the adapter to convert the array to views
        adapter = new PeopleAdapter(getApplicationContext(), people);
        // Attach the adapter to a ListView
        ListView peopleList= (ListView) findViewById(R.id.people_list);
        peopleList.setAdapter(adapter);
    }
    public void addTextPerson(View v){
        EditText newName = (EditText) findViewById(R.id.person_name);
        EditText newPhone = (EditText) findViewById(R.id.person_phone);
        EditText newAddress = (EditText) findViewById(R.id.person_address);
        EditText newEmail = (EditText) findViewById(R.id.person_email);

        people.add(new Person(newName.getText().toString(), newPhone.getText().toString(),
                    newAddress.getText().toString(), newEmail.getText().toString()));

        newName.setText("");
        newPhone.setText("");
        newAddress.setText("");
        newEmail.setText("");

        adapter.notifyDataSetChanged();
    }

}