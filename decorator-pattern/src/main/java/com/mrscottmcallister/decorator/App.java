package com.mrscottmcallister.decorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sandwich basicSandwich = new PeanutButter(new Jam(new PlainSandwich()));
        System.out.println("Ingredients: " + basicSandwich.getDescription());
        System.out.println("Price: $" + basicSandwich.getCost());
    }
}
