package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities){
        super(context,0, cities);
        this.cities = cities;
        this.context = context;
    }

    public int getCount() {
        return cities.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * This function will add a city into the list
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
        return;
    }

    /**
     * This function will delete the passed in city from the list
     * @param city
     */
    public void deleteCity(City city) {
        cities.remove(city);
    }

    /**
     * This function will check if the list has the passed in city
     * @param city
     * @return
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This function returns the number of cities in the list
     * @return
     */
    public int countCities() {
        return cities.size();
    }

}
