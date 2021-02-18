package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.RemoveDuplicatesSorted;



public class RemoveDuplicatesSortedTest {

    private int[] getDuplicateFreeSubArray(int duplicateFreeSubArrayLength, int[] array) {
        int[] duplicateFreeSubArray = new int[duplicateFreeSubArrayLength];
        for (int i = 0; i < duplicateFreeSubArrayLength; i++) {
            duplicateFreeSubArray[i] = array[i];
        }
        return duplicateFreeSubArray;
    }

    @Test
    public void testSmallInput1() {

        RemoveDuplicatesSorted removeDuplicatesSortedTest = new RemoveDuplicatesSorted();
        int[] input = new int[]{1,1,2,2,3,4,4,4,5,5};
        int[] duplicateFreeElements = new int[]{1,2,3,4,5};

        int outputLength = removeDuplicatesSortedTest.removeDuplicates(input);


        assertEquals(duplicateFreeElements.length, outputLength);
        assertArrayEquals(duplicateFreeElements, getDuplicateFreeSubArray(outputLength, input));



    }

    @Test
    public void testSmallInput2() {

        RemoveDuplicatesSorted removeDuplicatesSortedTest = new RemoveDuplicatesSorted();
        int[] input = new int[]{0,0,0,1,1,1,1,1,3,5,8,9};
        int[] duplicateFreeElements = new int[] {0,1,3,5,8,9};

        int outputLength = removeDuplicatesSortedTest.removeDuplicates(input);

        assertEquals(duplicateFreeElements.length, outputLength);
        assertArrayEquals(duplicateFreeElements, getDuplicateFreeSubArray(outputLength, input));

    }

    @Test
    public void testGetDuplicateFreeSubArray() {

        RemoveDuplicatesSorted removeDuplicatesSorted = new RemoveDuplicatesSorted();


        int[] input = new int[] {0,0,1,1,1,2,3,4,5,8};

        removeDuplicatesSorted.removeDuplicates(input);


        int[] expectedOutput = new int[] {0,1,2,3,4,5,8};

        int[] duplicateFreeSubArray = getDuplicateFreeSubArray(expectedOutput.length, input);

        assertArrayEquals(expectedOutput, duplicateFreeSubArray);

    }
}