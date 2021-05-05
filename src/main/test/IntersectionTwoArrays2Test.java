package main.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.IntersectionTwoArrays2;

public class IntersectionTwoArrays2Test {

    private IntersectionTwoArrays2 intersectionTwoArrays2;

    @Before
    public void setUp() {
        intersectionTwoArrays2 = new IntersectionTwoArrays2();

    }

    @Test
    public void test1() {

        int[] nums1 = new int[] {1, 2, 2, 1};
        int[] nums2 = new int[] {2, 2};
        int[] expectedOutput = new int[] {2, 2};

        assertArrayEquals(expectedOutput, intersectionTwoArrays2.intersect(nums1, nums2));


    }

    @Test
    public void test2() {

        int[] nums1 = new int[] {4, 9, 5};
        int[] nums2 = new int[] {9, 4, 9, 8, 4};
        int[] expectedOutput = new int[] {4, 9};

        assertArrayEquals(expectedOutput, intersectionTwoArrays2.intersect(nums1, nums2));
    }

}
