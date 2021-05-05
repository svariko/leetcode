package main.test;

import main.java.CountAndSay;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CountAndSayTest {
    private CountAndSay countAndSay;

    @Before
    public void setUp() {
        countAndSay = new CountAndSay();
    }

    @Test
    public void testNEqualsOne() {
        int n = 1;
        String expectedOutput = "1";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

    @Test
    public void testNEqualsTwo() {
        int n = 2;
        String expectedOutput = "11";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

    @Test
    public void testNEqualsThree() {
        int n = 3;
        String expectedOutput = "21";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

    @Test
    public void testNEqualsFour() {
        int n = 4;
        String expectedOutput = "1211";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

    @Test
    public void testNEqualsFive() {
        int n = 5;
        String expectedOutput = "111221";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

    @Test
    public void testNEqualsSix() {
        int n = 6;
        String expectedOutput = "312211";
        assertEquals(expectedOutput, countAndSay.countAndSay(n));
    }

}
