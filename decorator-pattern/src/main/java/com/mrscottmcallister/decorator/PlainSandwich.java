package com.mrscottmcallister.decorator;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class PlainSandwich implements Sandwich {

    public PlainSandwich() {
        System.out.println("Adding bread");
    }

    public String getDescription() {
        return "Two pieces of bread";
    }

    public double getCost() {
        System.out.println("Cost of bread: $0.99");
        return 0.99;
    }
}
