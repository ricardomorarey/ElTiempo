package com.eltiempo.ricar.eltiempo.API;

import com.eltiempo.ricar.eltiempo.API.Deserializer.MyDesserializer;
import com.eltiempo.ricar.eltiempo.Models.City;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ricardo Gonzalez Mora-Rey on 30/05/2017.
 */

public class API {

    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    private static Retrofit retrofit = null;
    public static final String APPKEY = "5731165715f7501401238fa51c5caecd";

    public static Retrofit getApi(){
        if (retrofit == null){

            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(City.class, new MyDesserializer());

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }
        return retrofit;
    }
}
