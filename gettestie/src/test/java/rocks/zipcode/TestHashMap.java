package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashMap {

    @Test
    public void testHashMap() {
        HashMap<String, Person> addressBook = new HashMap<>(); // key = name, value = person

        Person meredith = new Person("Meredith", 1992);
        meredith.setAddress("724 Ambleside Drive", "Wilmington", "19808");
        Person amanda = new Person("Amanda", 1993);
        amanda.setAddress("9 Henry Court", "Wilmington", "19808");
        Person paula = new Person("Paula", 1993);
        paula.setAddress("address", "town with name", "00000");
        Person mac = new Person("mac", 1992);
        mac.setAddress("a different address", "a different town with a name", "11111");

        addressBook.put("Meredith Brown", meredith);
        addressBook.put("Amanda Winkelmayer", amanda);
        addressBook.put("Paula Cerdas", paula);

        Assert.assertTrue(addressBook.size() == 3);

        Person expected1 = amanda;
        Person actual1 = addressBook.get("Amanda Winkelmayer");
        Assert.assertEquals(expected1, actual1);

        Assert.assertTrue(addressBook.containsKey("Paula Cerdas"));

        Assert.assertTrue(addressBook.containsValue(paula));

        addressBook.remove("Meredith Brown");

        Assert.assertTrue(addressBook.size() == 2);

        addressBook.clear();

        Assert.assertTrue(addressBook.isEmpty());
    }
}
