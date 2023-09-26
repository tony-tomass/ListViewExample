package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

import model.Pet;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.pets_LV);


        int selection = 2;
        populateListView(selection);
    }

    private void populateListView(int selection) {
        switch (selection) {
            case 1:
                useStringResource();
                break;
            case 2:
                usingDataArray();
                break;

        }
    }

    /**
     * This method populates the list view using a string resource containing
     * the content of a strings array resource
     */
    private void useStringResource() {
        String values[] = getResources().getStringArray(R.array.breeds);
        ArrayAdapter<String> adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
    }

    /**
     * This method populates the list view using a string resource containing the list of a data array
     */
    private void usingDataArray() {
        LinkedList<Pet> values = new LinkedList();
        values.add(new Pet("Kenny", "Husky", 15));
        values.add(new Pet("Dale", "Sausage", 15));
        values.add(new Pet("Kenny", "Husky", 15));
        values.add(new Pet("Kenny", "Husky", 15));
        values.add(new Pet("Kenny", "Husky", 15));
        ArrayAdapter<Pet> adapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, values);
        listView.setAdapter(adapter);
    }
}