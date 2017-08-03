package com.mrscottmcallister.decorator;

import junit.framework.TestCase;

/**
 * Created by scottmcallister on 2017-08-02.
 */
public class PlainSandwichTest extends TestCase {
    public void testGetDescription() throws Exception {
        PlainSandwich sandwich = new PlainSandwich();
        assertEquals("Two pieces of bread", sandwich.getDescription());
    }

    public void testGetCost() throws Exception {
        PlainSandwich sandwich = new PlainSandwich();
        assertEquals(0.99, sandwich.getCost());
    }

}