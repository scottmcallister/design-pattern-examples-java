package com.mrscottmcallister.strategy;

import junit.framework.TestCase;

/**
 * Created by scottmcallister on 2017-08-01.
 */
public class CarTest extends TestCase {
    Car testCar;
    public void setUp() throws Exception {
        super.setUp();
        testCar = new Car();
        testCar.setMake("Dodge");
        testCar.setModel("Viper");
        testCar.setYear(2007);
        testCar.setRetailPrice(90000.00);
        testCar.setEngineType(new GasolineEngine());
    }

    public void tearDown() throws Exception {
    }

    public void testGetMake() throws Exception {
        assertEquals("Dodge", testCar.getMake());
    }

    public void testSetMake() throws Exception {
        testCar.setMake("DODGE");
        assertEquals("DODGE", testCar.getMake());
    }

    public void testGetModel() throws Exception {
        assertEquals("Viper", testCar.getModel());
    }

    public void testSetModel() throws Exception {
        testCar.setModel("VIPER");
        assertEquals("VIPER", testCar.getModel());
    }

    public void testGetYear() throws Exception {
        assertEquals(2007, testCar.getYear());
    }

    public void testSetYear() throws Exception {
        testCar.setYear(1984);
        assertEquals(1984, testCar.getYear());
    }

    public void testGetRetailPrice() throws Exception {
        assertEquals(90000.00, testCar.getRetailPrice());
    }

    public void testSetRetailPrice() throws Exception {
        testCar.setRetailPrice(100000.00);
        assertEquals(100000.00, testCar.getRetailPrice());
    }

    public void testDescribe() throws Exception {
        String description = testCar.describe();
        String expectedDescription = "It's a  2007 Dodge Viper for $90000.0\n" +
                "It needs gasoline in the tank to get you around.";
        assertEquals(expectedDescription, description);
    }

    public void testSetEngineType() throws Exception {
        testCar.setEngineType(new HybridEngine());
        String description = testCar.describe();
        String expectedDescription = "It's a  2007 Dodge Viper for $90000.0\n" +
                "It'll take a tiny bit of gas and let the electric battery do most of the work!";
        assertEquals(expectedDescription, description);
    }


}