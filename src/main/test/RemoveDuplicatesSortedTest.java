package main.test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.java.RemoveDuplicatesSorted;


public class RemoveDuplicatesSortedTest {

    @Test
    public void testSmall() {

        RemoveDuplicatesSorted removeDuplicatesSortedTest = new RemoveDuplicatesSorted();
        int[] input = new int[]{1,1,2,2,3,4,4,4,5,5};

        int outputLength = removeDuplicatesSortedTest.removeDuplicates(input);
        assertEquals(5, outputLength);

    }

    @Test
    public void testSmall2() {

        RemoveDuplicatesSorted removeDuplicatesSortedTest = new RemoveDuplicatesSorted();
        int[] input = new int[]{1,1,2,2,3,4,4,4,5,5};

        int outputLength = removeDuplicatesSortedTest.removeDuplicates(input);
        assertEquals(5, outputLength);

    }
}