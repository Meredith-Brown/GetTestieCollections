package rocks.zipcode;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {

    @Test
    public void TestHashSet() {
        HashSet<Person> addressBook = new HashSet<>();

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
        addressBook.add(meredith);
        addressBook.add(amanda);
        int expectedSize1 = 3;
        int actualSize1 = addressBook.size();
        assertEquals(expectedSize1, actualSize1);

        assertEquals(true, addressBook.contains(meredith));

        addressBook.remove(meredith);
        assertEquals(false, addressBook.contains(meredith));
        int expectedSize2 = 2;
        int actualSize2 = addressBook.size();
        assertEquals(expectedSize2, actualSize2);

        addressBook.clear();
        int expectedSize3 = 0;
        int actualSize3 = addressBook.size();
        assertEquals(expectedSize3, actualSize3);

        assertEquals(true, addressBook.isEmpty());
    }

}
