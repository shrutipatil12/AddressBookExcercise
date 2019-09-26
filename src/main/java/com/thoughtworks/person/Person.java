package com.thoughtworks.person;

import com.thoughtworks.addressBook.Address;

public class Person {
    String name;
    int mobileNumber;
    Address address;

    public Person(String name, int mobileNumber, Address address) {

        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.thoughtworks.person.Person{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", address=" + address +
                '}';
    }
}

