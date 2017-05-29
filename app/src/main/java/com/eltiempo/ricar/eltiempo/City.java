package com.eltiempo.ricar.eltiempo;

import com.google.gson.annotations.Expose;

/**
 * Created by Ricardo Gonzalez Mora-Rey on 29/05/2017.
 */

public class City {

    @Expose
    private int id;
    private String name;


    public City(){}


    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
