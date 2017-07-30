package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class ToyotaPrius extends Car {
    public ToyotaPrius() {
        setMake("Toyota");
        setModel("Prius");
        setYear(2017);
        setRetailPrice(2719.00);
        engine = new HybridEngine();
    }
}
