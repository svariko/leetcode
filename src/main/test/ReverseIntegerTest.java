package main.test;

import main.java.ReverseInteger;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @Before
    public void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void test1() {
        int input = 123;
        int expectedOutput = 321;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test2() {
        int input = -123;
        int expectedOutput = -321;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test3() {
        int input = 120;
        int expectedOutput = 21;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test4() {
        int input = 0;
        int expectedOutput = 0;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test5() {
        int input = Integer.MAX_VALUE;
        int expectedOutput = 0;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test6() {
        int input = Integer.MIN_VALUE;
        int expectedOutput = 0;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }

    @Test
    public void test7() {
        int input = 2170000;
        int expectedOutput = 712;
        assertEquals(expectedOutput, reverseInteger.reverseInteger(input));
    }


}
