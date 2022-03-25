package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testLinkedList() {
        LinkedList<Person> addressBook = new LinkedList<>();

        Person meredith = new Person("Meredith", 1992);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person amanda = new Person("Amanda", 1993);
        amanda.setAddress("9 Henry Court", "Wilmington", "19808");
        Person paula = new Person("Paula", 1993);
        paula.setAddress("address", "town with name", "00000");
        Person mac = new Person("mac", 1992);
        mac.setAddress("a different address", "a different town with a name", "11111");

        addressBook.add(mac);
        addressBook.addFirst(amanda);
        addressBook.addLast(meredith);

        Assert.assertTrue(addressBook.size() == 3);

        Assert.assertTrue(addressBook.contains(mac));

        addressBook.set(2, paula);

        Assert.assertTrue(addressBook.size() == 3);
        Assert.assertTrue(addressBook.peekLast().equals(paula));

        Assert.assertTrue(addressBook.indexOf(amanda) == 0);
        Assert.assertTrue(addressBook.indexOf(meredith) == -1);

        addressBook.clear();

        Assert.assertTrue(addressBook.isEmpty());
    }
}
