package main.test;

import org.junit.Test;
import main.java.RotateArray;
import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void testOddInputLengthAndOddShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        int[] expectedOutput = new int[] {5,6,7,1,2,3,4};

        rotateArray.rotate(input, k);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testEvenInputLengthAndEvenShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {-1,-100,3,99};
        int k = 2;
        int[] expectedOutput = new int[] {3,99,-1,-100};

        rotateArray.rotate(input, k);


        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testEvenInputLengthAndOddShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {-1,-100,3,99};
        int k = 1;
        int[] expectedOutput = new int[] {99,-1,-100,3};

        rotateArray.rotate(input, k);


        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testOddInputLengthAndEvenShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {1,2,3,4,5};
        int k = 4;
        int[] expectedOutput = new int[] {2,3,4,5,1};

        rotateArray.rotate(input, k);


        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testInputLengthEqualToShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {1,2,3,4};
        int k = 4;
        int[] expectedOutput = new int[] {1,2,3,4};

        rotateArray.rotate(input, k);


        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testInputLengthLessThanShift() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[] {1,2,3};
        int k = 4;
        int[] expectedOutput = new int[] {3,1,2};

        rotateArray.rotate(input, k);


        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testZeroInputLength() {

        RotateArray rotateArray = new RotateArray();
        int[] input = new int[0];
        int k = 4;
        int[] expectedOutput = new int[0];

        rotateArray.rotate(input, k);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    public void testNullInput() {

        RotateArray rotateArray = new RotateArray();
        int[] input = null;
        int k = 4;
        int[] expectedOutput = null;

        rotateArray.rotate(input, k);

        assertArrayEquals(expectedOutput, input);
    }
}
