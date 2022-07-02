package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList <String> cities;

    public CustomAdapter(Context context, int layout, ArrayList <String> cities){
        this.context = context;
        this.layout = layout;
        this.cities = cities;
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @Override
    public Object getItem(int i) {
        return this.cities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View itemView = view;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        itemView = layoutInflater.inflate(R.layout.cities_list, null);

        String currentNameCity = cities.get(i);

        TextView textView = itemView.findViewById(R.id.nameCityList);
        textView.setText(currentNameCity);

        return itemView;
    }
}
