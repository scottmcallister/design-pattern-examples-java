package com.mrscottmcallister.strategy;

/**
 * Created by scottmcallister on 2017-07-30.
 */
public class HybridEngine implements EngineStrategy {

    public String fuel() {
        return "It'll take a tiny bit of gas and let the electric battery do most of the work!";
    }
}
