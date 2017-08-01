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
        System.out.println(car1.describe() + "\n");
        System.out.println(car2.describe() + "\n");

        System.out.println("Changing engine type..." + "\n");
        car1.setEngineType(new HybridEngine());
        System.out.println(car1.describe() + "\n");
    }
}
