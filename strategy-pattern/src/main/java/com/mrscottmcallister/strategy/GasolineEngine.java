package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class GasolineEngine implements EngineStrategy{
    public String fuel() {
        return "It needs gasoline in the tank to get you around.";
    }
}
