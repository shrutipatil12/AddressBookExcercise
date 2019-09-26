package com.thoughtworks.addressBook;

import com.thoughtworks.person.Person;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Person> people;

    public AddressBook() {
        people = new ArrayList<>();
    }

    public boolean add(Person person) {
        people = new ArrayList<>();

        people.add(person);
        return true;
    }

    public List<Person> get() {
        return new ArrayList<>();
    }
}
