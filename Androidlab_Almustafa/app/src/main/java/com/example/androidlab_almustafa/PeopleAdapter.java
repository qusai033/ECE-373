package com.example.androidlab_almustafa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PeopleAdapter extends ArrayAdapter<Person> {

    public PeopleAdapter(Context c, ArrayList<Person> people){
        super(c, 0, people);
    }

    /*
     * In Android development, any time we want to show a vertical list of scrollable items
     * we will use a ListView which has data populated using an Adapter.
     * The simplest adapter to use is called an ArrayAdapter because the adapter
     * converts an ArrayList of objects into View items loaded into the ListView container
     * When your ListView is connected to an adapter, the adapter will instantiate rows
     * until the ListView has been fully populated with enough items to fill the full
     * height of the screen. At that point, no additional row items are created in memory
     */

    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_person_row,
                    parent, false);
        }
        // Get the data item for this position
        Person person = getItem(position);
        // Lookup view for data population
        // Populate the data into the template view using the data object
        TextView personName = convertView.findViewById(R.id.row_person_name);
        TextView personPhone = convertView.findViewById(R.id.row_person_phone);
        TextView personAddress = convertView.findViewById(R.id.row_person_address);
        TextView personEmail = convertView.findViewById(R.id.row_person_email);


        personName.setText(person.getName());
        personPhone.setText(person.getPhone());
        personAddress.setText(person.getAddress());
        personEmail.setText(person.getEmail());

        // Return the completed view to render on screen

        return convertView;
    }

}
