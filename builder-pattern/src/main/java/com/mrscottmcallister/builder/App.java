package com.mrscottmcallister.builder;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerAccount.Builder customerBuilder = new CustomerAccount.Builder("email@gmail.com", "password")
                .age(10)
                .cardCode(101)
                .cardNumber(9876543211234567L)
                .firstName("Jane")
                .lastName("Doe")
                .phone(1234567890L)
                .expirationDate(new Date(1501808111L));
        CustomerAccount customer = customerBuilder.build();
        System.out.println("email: " + customer.getEmail());
        System.out.println("password: " + customer.getPassword());
        System.out.println("firstName: " + customer.getFirstName());
        System.out.println("lastName: " + customer.getLastName());
        System.out.println("age: " + customer.getAge());
        System.out.println("phone: " + customer.getPhone());
        System.out.println("cardNumber: " + customer.getCardNumber());
        System.out.println("cardCode: " + customer.getCardCode());
        System.out.println("expirationDate: " + customer.getExpirationDate());
    }
}
