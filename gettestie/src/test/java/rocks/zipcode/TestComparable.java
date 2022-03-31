package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    @Test
    public void testComparable() {
        ArrayList<Person> addressBook = new ArrayList<>();

        Person meredith = new Person("Meredith", 1992);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person amanda = new Person("Amanda", 1993);
        amanda.setAddress("9 Henry Court", "Wilmington", "19808");
        Person paula = new Person("Paula", 1993);
        paula.setAddress("address", "town with name", "00000");
        Person mac = new Person("Mac", 1992);
        mac.setAddress("a different address", "a different town with a name", "11111");
        Person meredith2 = new Person("Meredith", 1991);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person paula2 = new Person("Paula", 1990);
        paula.setAddress("address", "town with name", "00000");

        addressBook.add(meredith);
        addressBook.add(amanda);
        addressBook.add(paula);
        addressBook.add(meredith2);
        addressBook.add(paula2);
        addressBook.add(mac);

        Collections.sort(addressBook, Person::compareTo);
        Assert.assertEquals(amanda, addressBook.get(0));
        Assert.assertEquals(mac, addressBook.get(1));
        Assert.assertEquals(meredith2, addressBook.get(2));
        Assert.assertEquals(meredith, addressBook.get(3));
        Assert.assertEquals(paula2, addressBook.get(4));
        Assert.assertEquals(paula, addressBook.get(5));
    }
}
