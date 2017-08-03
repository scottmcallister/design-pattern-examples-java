package com.mrscottmcallister.decorator;

/**
 * Created by scottmcallister on 2017-08-02.
 */
abstract class ToppingDecorator implements Sandwich {
    protected Sandwich tempSandwich;

    public ToppingDecorator(Sandwich newSandwich) {
        tempSandwich = newSandwich;
    }

    public String getDescription() {
        return tempSandwich.getDescription();
    }

    public double getCost() {
        return tempSandwich.getCost();
    }
}
