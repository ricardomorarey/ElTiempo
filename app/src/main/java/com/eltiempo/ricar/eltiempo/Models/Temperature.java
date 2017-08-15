package com.eltiempo.ricar.eltiempo.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ricardo Gonzalez Mora-Rey on 02/06/2017.
 */

public class Temperature {

    @SerializedName("temp")
    private float temperature;
    private float pressure;
    private float humidity;
    private float temp_min;
    private float temp_max;

    public Temperature(){

    }

    public Temperature(float temperature, float pressure, float humidity, float temp_min, float temp_max) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
}
