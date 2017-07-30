package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class FordMustang extends Car{
    public FordMustang() {
        setMake("Ford");
        setModel("Mustang");
        setYear(2017);
        setRetailPrice(24532.00);
        engine = new GasolineEngine();
    }
}
