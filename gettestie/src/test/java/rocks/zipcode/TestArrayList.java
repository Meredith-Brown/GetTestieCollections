package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestArrayList {

    @Test
    public void TestArrayList() {
        ArrayList<Person> addressBook = new ArrayList<>();

        Person meredith = new Person("Meredith", 1992);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person amanda = new Person("Amanda", 1993);
        amanda.setAddress("9 Henry Court", "Wilmington", "19808");
        Person paula = new Person("Paula", 1993);
        paula.setAddress("address", "town with name", "00000");
        Person mac = new Person("mac", 1992);
        mac.setAddress("a different address", "a different town with a name", "11111");

        addressBook.add(meredith);
        addressBook.add(amanda);
        addressBook.add(paula);
        int expectedSize1 = 3;
        int actualSize1 = addressBook.size();
        assertEquals(expectedSize1, actualSize1);

        boolean expectedBoolean1 = true;
        boolean actualBoolean1 = addressBook.contains(meredith);
        assertEquals(expectedBoolean1, actualBoolean1);
        boolean expectedBoolean2 = false;
        boolean actualBoolean2 = addressBook.contains(mac);
        assertEquals(expectedBoolean2, actualBoolean2);

        Person expectedPerson = amanda;
        Person actualPerson = addressBook.get(1);
        assertEquals(expectedPerson, actualPerson);

        addressBook.set(0, mac);
        Person expectedPerson2 = mac;
        Person actualPerson2 = addressBook.get(0);
        assertEquals(expectedPerson2, actualPerson2);

        addressBook.remove(2);
        addressBook.remove(mac);
        addressBook.remove(amanda);
        int expectedSize2 = 0;
        int actualSize2 = addressBook.size();
        assertEquals(expectedSize2, actualSize2);

        assertEquals(true, addressBook.isEmpty());

    }

}
