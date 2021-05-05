package main.test;

import main.java.SingleNumber;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingleNumberTest {


    private SingleNumber singleNumber = null;

    @Before
    public void setUp() {
        singleNumber = new SingleNumber();

    }

    @Test
    public void test1() {

        int[] input = new int[] {2, 2, 1};
        int expectedOutput = 1;

        assertEquals(expectedOutput, singleNumber.singleNumber(input));


    }

    @Test
    public void test2() {

        int[] input = new int[] {4, 1, 2, 1, 2};
        int expectedOutput = 4;

        assertEquals(expectedOutput, singleNumber.singleNumber(input));
    }

    @Test
    public void test3() {

        int[] input = new int[] {1};
        int expectedOutput = 1;

        assertEquals(expectedOutput, singleNumber.singleNumber(input));
    }
}
