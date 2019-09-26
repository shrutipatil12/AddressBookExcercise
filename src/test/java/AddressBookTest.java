import com.thoughtworks.addressBook.Address;
import com.thoughtworks.addressBook.AddressBook;
import com.thoughtworks.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddressBookTest {
    @Test
    void givenOnePerson_WhenAdd_ThenShouldAddPerson() {
        Address address = new Address("India", "BTM", 445566);
        Person person = new Person("Shruti", 1234567890, address);

        AddressBook addressBook = new AddressBook();

        assertEquals(true, addressBook.add(person));

    }

    @Test
    void givenTwoPerson_WhenAdd_ThenShouldAddPerson() {
        Address addressOfShruti = new Address("India", "BTM", 445566);
        Address addressOfAvani = new Address("India", "BTM", 445566);
        Person shruti = new Person("Shruti", 1234567890, addressOfShruti);
        Person avani = new Person("Avani", 1243546576, addressOfAvani);

        AddressBook addressBook = new AddressBook();

        assertEquals(true, addressBook.add(shruti));
        assertEquals(true, addressBook.add(avani));

    }

    @Test
    void givenZeroPerson_WhenRetriveAddressBook_ThenItShouldNotReturnThePerson() {
        AddressBook addressBook = new AddressBook();

        assertTrue(addressBook.get().isEmpty());

    }
}
