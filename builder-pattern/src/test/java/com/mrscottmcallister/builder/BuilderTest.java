package com.mrscottmcallister.builder;

import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by scottmcallister on 2017-08-03.
 */
public class BuilderTest extends TestCase {
    CustomerAccount.Builder customerBuilder;
    public void setUp() throws Exception {
        super.setUp();
         customerBuilder = new CustomerAccount.Builder("example@gmail.com", "password");
    }

    public void testFirstName() throws Exception {
        customerBuilder.firstName("Jonas");
        CustomerAccount jonas = customerBuilder.build();
        assertEquals(jonas.getFirstName(), "Jonas");
    }

    public void testLastName() throws Exception {
        customerBuilder.lastName("Roboto");
        CustomerAccount mrRoboto = customerBuilder.build();
        assertEquals(mrRoboto.getLastName(), "Roboto");
    }

    public void testAge() throws Exception {
        customerBuilder.age(23);
        CustomerAccount whatsMyAgeAgain = customerBuilder.build();
        assertEquals(whatsMyAgeAgain.getAge(), 23);
    }

    public void testPhone() throws Exception {
        customerBuilder.phone(4161234567L);
        CustomerAccount customer = customerBuilder.build();
        assertEquals(customer.getPhone(), 4161234567L);
    }

    public void testCardNumber() throws Exception {
        customerBuilder.cardNumber(1234567898765432L);
        CustomerAccount customer = customerBuilder.build();
        assertEquals(customer.getCardNumber(), 1234567898765432L);
    }

    public void testCardCode() throws Exception {
        customerBuilder.cardCode(808);
        CustomerAccount customer = customerBuilder.build();
        assertEquals(customer.getCardCode(), 808);
    }

    public void testExpirationDate() throws Exception {
        Date expires = new Date(1501808111L);
        customerBuilder.expirationDate(expires);
        CustomerAccount customer = customerBuilder.build();
        assertEquals(customer.getExpirationDate(), expires);
    }

}