package com.mrscottmcallister.decorator;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class PeanutButter extends ToppingDecorator {
    public PeanutButter(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding peanut butter");
    }

    public String getDescription() {
        return tempSandwich.getDescription() + ", peanut butter";
    }

    public double getCost() {
        System.out.println("Cost of peanut butter: $0.50");
        return tempSandwich.getCost() + 0.5;
    }


}
