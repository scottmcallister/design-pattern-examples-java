package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class TeslaModelS extends Car {
    public TeslaModelS() {
        setMake("Tesla");
        setModel("Model S");
        setYear(2017);
        setRetailPrice(99150.00);
        engine = new ElectricEngine();
    }
}
