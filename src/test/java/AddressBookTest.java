import com.thoughtworks.addressBook.Address;
import com.thoughtworks.addressBook.AddressBook;
import com.thoughtworks.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookTest {
    @Test
    void givenPerson_WhenAdd_ThenShouldAddPerson() {
        Address address = new Address("India", "BTM", 445566);
        Person person = new Person("Shruti", 1234567890, address);

        AddressBook addressBook = new AddressBook();

        assertEquals(true, addressBook.add(person));

    }
}
