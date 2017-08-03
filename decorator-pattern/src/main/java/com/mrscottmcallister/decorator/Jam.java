package com.mrscottmcallister.decorator;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class Jam extends ToppingDecorator {
    public Jam(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding jam");
    }

    public String getDescription() {
        return tempSandwich.getDescription() + ", jam";
    }

    public double getCost() {
        System.out.println("Cost of jam: $0.50");
        return tempSandwich.getCost() + 0.5;
    }
}
