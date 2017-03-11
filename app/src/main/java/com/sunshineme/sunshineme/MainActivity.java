package com.sunshineme.sunshineme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();
        
        list.add("Mon 6/23 - Sunny - 31/17");
        list.add("Tue 6/24 - Foggy - 21/8");
        list.add("Wed 6/25 - Cloudy - 22/17");
        list.add("Thurs 6/26 - Rainy - 18/11");
        list.add("Fri 6/27 - Foggy - 21/10");
        list.add("Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18");
        list.add("Sun 6/29 - Sunny - 20/7");



        List<String> weekForecast = list;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        ListView listView = (ListView)  findViewById(R.id.list_view_forecast);
        listView.setAdapter(adapter);

    }
}
