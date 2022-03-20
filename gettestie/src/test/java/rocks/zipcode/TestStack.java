package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() { // supplied
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void TestStack2() {
        Stack<String> stack2 = new Stack<>();

        stack2.push("Naomi");
        stack2.push("Ellie");

        int expectedSize1 = 2;
        int actualSize1 = stack2.size();

        String expectedPop = "Ellie";
        String actualPop = stack2.pop();

        String expectedPeek = "Naomi";
        String actualPeek = stack2.peek();

        boolean expectedBoolean = true;
        stack2.clear();

        assertEquals(expectedSize1, actualSize1);
        assertEquals(expectedPop, actualPop);
        assertEquals(expectedPeek, actualPeek);
        assertEquals(expectedBoolean, stack2.isEmpty());
    }

}
