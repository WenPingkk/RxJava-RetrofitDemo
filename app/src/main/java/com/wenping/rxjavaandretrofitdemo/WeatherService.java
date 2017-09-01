package com.wenping.rxjavaandretrofitdemo;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wenping on 9/1/2017.
 */

public interface WeatherService {
    //http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=您申请的KEY
//cityname=%E4%B8%8A%E6%B5%B7&dtype=json&format=1&key=4f0400b15ffec0136daf3350cb408480
    //Rxjava+retrofit
    @GET("index")
    public Observable<WeatherData>
    getWeatherByRxjava(@Query("cityname") String cityname,
                       @Query("dtype") String json,
                       @Query("format") int format,
                       @Query("key") String key);

}
