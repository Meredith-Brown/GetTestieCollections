package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    @Test
    public void testVector() {
        Vector<Person> addressBook = new Vector<>();

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
        Person expectedFirst = meredith;
        Person actualFirst = addressBook.get(0);
        assertEquals(expectedFirst, actualFirst);
        Person expectedLast = paula;
        Person actualLast = addressBook.get(2);
        assertEquals(expectedLast, actualLast);
        Assert.assertTrue(addressBook.contains(amanda));

        addressBook.clear();
        int expectedSize2 = 0;
        int actualSize2 = addressBook.size();
        assertEquals(expectedSize2, actualSize2);

        assertEquals(true, addressBook.isEmpty());
    }
}
