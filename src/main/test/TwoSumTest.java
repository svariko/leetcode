package main.test;

import main.java.TwoSum;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TwoSumTest {
    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void test1() {
        int[] input = new int[] {2,7,11,15};
        int target = 9;
        int[] expectedOutput = new int[] {0,1};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));
    }

    @Test
    public void test2() {
        int[] input = new int[] {3,2,4};
        int target = 6;
        int[] expectedOutput = new int[] {1,2};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));
    }

    @Test
    public void test3() {
        int[] input = new int[] {3,3};
        int target = 6;
        int[] expectedOutput = new int[] {0,1};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));
    }

    @Test
    public void test4() {
        int[] input = new int[] {2,3,1,5,14,9,8};
        int target = 13;
        int[] expectedOutput = new int[] {3,6};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));
    }

    @Test
    public void test5() {
        int[] input = new int[] {0,4,3,0};
        int target = 0;
        int[] expectedOutput = new int[] {0,3};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));

    }

    @Test
    public void test6() {
        int[] input = new int[] {0,4,-3,1};
        int target = -3;
        int[] expectedOutput = new int[] {0,2};

        assertArrayEquals(expectedOutput, twoSum.twoSum(input, target));

    }
}
