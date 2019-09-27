package com.thoughtworks.addressBook;

import com.thoughtworks.person.Person;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Person> people;

    public AddressBook() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public List<Person> get() {

        return people;
    }
}
