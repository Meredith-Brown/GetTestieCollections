package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestIterator {

    @Test
    public void TestIterator() {
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
        Iterator<Person> iterator = addressBook.iterator();
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals(paula, iterator.next());

        iterator.remove();
        Assert.assertEquals(meredith, iterator.next());

        Assert.assertTrue(iterator.hasNext());
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
    }
}
