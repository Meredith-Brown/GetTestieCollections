package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {

    @Test
    public void TestArrayDeque() {
        ArrayDeque<Person> addressBook = new ArrayDeque<>();

        Person meredith = new Person("Meredith", 1992);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person amanda = new Person("Amanda", 1993);
        amanda.setAddress("9 Henry Court", "Wilmington", "19808");
        Person paula = new Person("Paula", 1993);
        paula.setAddress("address", "town with name", "00000");
        Person mac = new Person("mac", 1992);
        mac.setAddress("a different address", "a different town with a name", "11111");

        addressBook.addFirst(meredith);
        addressBook.addLast(amanda);
        addressBook.addFirst(paula);
        int expectedSize1 = 3;
        int actualSize1 = addressBook.size();
        assertEquals(expectedSize1, actualSize1);
        Person expectedFirst = paula;
        Person actualFirst = addressBook.getFirst();
        assertEquals(expectedFirst, actualFirst);
        Person expectedLast = amanda;
        Person actualLast = addressBook.getLast();
        assertEquals(expectedLast, actualLast);

        addressBook.clear();
        int expectedSize2 = 0;
        int actualSize2 = addressBook.size();
        assertEquals(expectedSize2, actualSize2);

        assertEquals(true, addressBook.isEmpty());
    }

}
