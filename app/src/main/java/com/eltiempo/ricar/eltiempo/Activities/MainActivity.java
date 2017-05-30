package com.eltiempo.ricar.eltiempo.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.eltiempo.ricar.eltiempo.API.API;
import com.eltiempo.ricar.eltiempo.API.APIServices.WeatherService;
import com.eltiempo.ricar.eltiempo.Models.City;
import com.eltiempo.ricar.eltiempo.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WeatherService service = API.getApi().create(WeatherService.class);
        Call<City> cityCall = service.getCity("London,UK", API.APPKEY);

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                City city = response.body();

            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Error!!", Toast.LENGTH_LONG);
            }
        });
    }
}
