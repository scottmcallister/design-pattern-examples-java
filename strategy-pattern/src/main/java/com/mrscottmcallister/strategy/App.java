package com.mrscottmcallister.strategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car1 = new FordMustang();
        Car car2 = new ToyotaPrius();
        Car car3 = new TeslaModelS();
        Car[] cars = { car1, car2, car3 };
        for(int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + ":");
           System.out.println(cars[i].describe());
           System.out.println("\n");
        }

    }
}
