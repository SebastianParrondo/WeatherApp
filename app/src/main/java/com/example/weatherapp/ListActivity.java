package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listCity;
    private ArrayList <String> cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        setupListCity();

    }

    public void setupListCity(){
        listCity = findViewById(R.id.listCity);

        cities = new ArrayList<>();
        cities.add("Buenos Aires");
        cities.add("Montevideo");
        cities.add("Nueva York");
        cities.add("Barcelona");
        cities.add("Londres");

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, cities);

        listCity.setAdapter(customAdapter);
    }
}