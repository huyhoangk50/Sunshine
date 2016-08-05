package com.game.huyhoang.sunshine.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.game.huyhoang.sunshine.R;

import java.util.ArrayList;

/**
 * Created by huyhoang on 05/08/2016.
 */
public class MainFragment extends Fragment{
    ArrayList<String> forecastList = new ArrayList<>();
    ListView lvForecast;
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.main_fragment, container, false);

        initView();
        initListForecast();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_text_view, forecastList);
        lvForecast.setAdapter(adapter);

        return rootView;
    }



    private void initListForecast(){
        forecastList.add("Today-Sunny-88/63");
        forecastList.add("Tomorrow-Sunny-72/60");
        forecastList.add("Weds-Cloudy-88/63");
        forecastList.add("Thurs-Rainy-63/41");
        forecastList.add("Fri-Foogy-70 /46");
        forecastList.add("Sat-Sunny-76/88");
    }

    private void initView(){
        lvForecast = (ListView) rootView.findViewById(R.id.list_view_forecast);
    }

}
