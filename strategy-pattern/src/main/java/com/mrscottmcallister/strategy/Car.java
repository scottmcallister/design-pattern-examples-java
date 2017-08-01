package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double retailPrice;
    public EngineStrategy engine;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setEngineType(EngineStrategy type) {
        engine = type;
    }

    public String describe() {
        String response = "It's a " + " " + year + " " + make + " " + model + " for $" + retailPrice;
        response += "\n" + engine.fuel();
        return response;
    }
}
