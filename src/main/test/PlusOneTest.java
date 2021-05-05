package main.test;

import main.java.PlusOne;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PlusOneTest {
    private PlusOne plusOne;

    @Before
    public void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    public void test1() {
        int[] input = new int[] {1,2,3};
        int[] expectedOutput = new int[] {1, 2, 4};

        assertArrayEquals(expectedOutput, plusOne.plusOne(input));
    }

    @Test
    public void test2() {
        int[] input = new int[] {4,3,2,1};
        int[] expectedOutput = new int[] {4,3,2,2};

        assertArrayEquals(expectedOutput, plusOne.plusOne(input));
    }
}
