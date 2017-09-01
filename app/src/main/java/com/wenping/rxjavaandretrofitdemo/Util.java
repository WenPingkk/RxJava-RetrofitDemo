package com.wenping.rxjavaandretrofitdemo;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wenping on 9/1/2017.
 */

public class Util {

//    http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY
//    private static final String URLS = "http://api.openweathermap.org/data/2.5/";
//    cityname=%E4%B8%8A%E6%B5%B7&dtype=json&format=1&key=4f0400b15ffec0136daf3350cb408480
    private static final String URLS = "http://v.juhe.cn/weather/";
    private WeatherService mService;

    public WeatherService getWeatherService() {
        return mService;
    }

    public Util() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(URLS)
                .addConverterFactory(GsonConverterFactory.create()).
                addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mService = retrofit.create(WeatherService.class);
    }
}






































