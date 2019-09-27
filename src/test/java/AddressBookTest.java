import com.thoughtworks.addressBook.Address;
import com.thoughtworks.addressBook.AddressBook;
import com.thoughtworks.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddressBookTest {


    @Test
    void givenZeroPerson_WhenRetriveAddressBook_ThenItShouldNotReturnThePerson() {
        AddressBook addressBook = new AddressBook();

        assertTrue(addressBook.get().isEmpty());

    }

    @Test
    void givenOnePerson_WhenRetriveAddressBook_ThenItShouldReturnThatPerson() {
        Address address = new Address("India", "BTM", 445566);
        Person person = new Person("Shruti", 1234567890, address);

        AddressBook addressBook = new AddressBook();
        addressBook.add((person));

        assertEquals(1, addressBook.get().size());
    }
}
