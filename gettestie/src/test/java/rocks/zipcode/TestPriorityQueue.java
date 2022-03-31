package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void testPriorityQueue() {
        PriorityQueue<Person> addressBook = new PriorityQueue<>(Person::compareTo);

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

        Assert.assertEquals(amanda, addressBook.poll());
        Assert.assertEquals(mac, addressBook.peek());
        addressBook.remove();
        Assert.assertEquals(meredith2, addressBook.element());
        addressBook.remove();
        Assert.assertEquals(meredith, addressBook.poll());
        Assert.assertEquals(paula2, addressBook.poll());
        Assert.assertEquals(paula, addressBook.poll());
    }
}


