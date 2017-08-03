package com.mrscottmcallister.decorator;

import junit.framework.TestCase;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class PeanutButterTest extends TestCase {
    public void testGetDescription() throws Exception {
        Sandwich peanutButterSandwich = new PeanutButter(new PlainSandwich());
        String expectedDescription = "Two pieces of bread, peanut butter";
        assertEquals(expectedDescription, peanutButterSandwich.getDescription());
    }

    public void testGetCost() throws Exception {
        Sandwich peanutButterSandwich = new PeanutButter(new PlainSandwich());
        double expectedCost = 1.49;
        assertEquals(expectedCost, peanutButterSandwich.getCost());
    }

}