package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class ElectricEngine implements EngineStrategy{
    public String fuel() {
        return "Just plug it in to an outlet. No gas required!";
    }
}
