package com.mrscottmcallister.builder;

import java.util.Date;

/**
 * Created by scottmcallister on 2017-08-03.
 */
public class CustomerAccount {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private long phone;
    private long cardNumber;
    private int cardCode;
    private Date expirationDate;

    public static class Builder {
        private final String email;
        private final String password;
        private String firstName = "";
        private String lastName = "";
        private int age = 0;
        private long phone = 5555555555L;
        private long cardNumber = 1000000000000000L;
        private int cardCode = 100;
        private Date expirationDate = new Date();

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Builder firstName(String val) {
            this.firstName = val;
            return this;
        }
        public Builder lastName(String val) {
            this.lastName = val;
            return this;
        }
        public Builder age(int val) {
            this.age = val;
            return this;
        }
        public Builder phone(long val) {
            this.phone = val;
            return this;
        }
        public Builder cardNumber(long val) {
            this.cardNumber = val;
            return this;
        }
        public Builder cardCode(int val) {
            this.cardCode = val;
            return this;
        }
        public Builder expirationDate(Date val) {
            this.expirationDate = val;
            return this;
        }

        public CustomerAccount build() {
            return new CustomerAccount(this);
        }
    }

    private CustomerAccount(Builder builder) {
        email = builder.email;
        password = builder.password;
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        phone = builder.phone;
        cardNumber = builder.cardNumber;
        cardCode = builder.cardCode;
        expirationDate = builder.expirationDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getCardCode() {
        return cardCode;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
