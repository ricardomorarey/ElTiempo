package com.eltiempo.ricar.eltiempo.API.APIServices;

import com.eltiempo.ricar.eltiempo.Models.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ricardo Gonzalez Mora-Rey on 29/05/2017.
 */

public interface WeatherService {

    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid" ) String key);
}
