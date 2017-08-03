package com.mrscottmcallister.decorator;

import junit.framework.TestCase;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class JamTest extends TestCase {
    public void testGetDescription() throws Exception {
        Sandwich jamSandwich = new Jam(new PlainSandwich());
        String expectedDescription = "Two pieces of bread, jam";
        assertEquals(expectedDescription, jamSandwich.getDescription());
    }

    public void testGetCost() throws Exception {
        Sandwich jamSandwich = new Jam(new PlainSandwich());
        double expectedCost = 1.49;
        assertEquals(expectedCost, jamSandwich.getCost());
    }

}