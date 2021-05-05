package main.test;

import main.java.ListNode;
import main.java.LinkedListUtils;
import main.java.MergeTwoSortedLists;
import org.junit.Test;
import org.junit.Before;

import java.util.List;


import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;
    private ListNode listNodeUtilities = new ListNode();

    @Before
    public void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void testTwoNonEmptyLists() {

        ListNode l1 = LinkedListUtils.buildList(new int[] {1,2,4});
        ListNode l2 = LinkedListUtils.buildList(new int[] {1,3,4});
        int[] expectedValues = new int[] {1,1,2,3,4,4};

        ListNode merged = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        int[] generatedValues = LinkedListUtils.buildArray(merged);

        assertArrayEquals(expectedValues, generatedValues);

    }

    @Test
    public void testTwoEmptyLists() {

        assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));

    }

    @Test
    public void testEmptyAndNonEmptyCombination() {
        ListNode l1 = null;
        ListNode l2 = LinkedListUtils.buildList(new int[] {0});
        int[] expectedValues = new int[] {0};

        ListNode merged = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        int[] generatedValues = LinkedListUtils.buildArray(merged);

        assertArrayEquals(expectedValues, generatedValues);
    }

    @Test
    public void testBuildingSmallList() {
        int[] inputArray = new int[] {1, 2, 4};
        ListNode builtList = LinkedListUtils.buildList(inputArray);

        assertTrue(LinkedListUtils.isEquivalentRepresentation(builtList, inputArray));

    }

    @Test
    public void testBuildingMediumList() {
        int[] inputArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode builtList = LinkedListUtils.buildList(inputArray);

        assertTrue(LinkedListUtils.isEquivalentRepresentation(builtList, inputArray ));
    }

    @Test
    public void testBuildingListFromEmptyArray() {
        int[] array = new int[0];
        ListNode builtList = LinkedListUtils.buildList(array);

        assertTrue(LinkedListUtils.isEquivalentRepresentation(builtList, array));
    }

    @Test
    public void testBuildingListFromNullArray() {

        ListNode builtList = LinkedListUtils.buildList(null);

        assertTrue(LinkedListUtils.isEquivalentRepresentation(builtList, null));

    }

    @Test
    public void testSmallArrayAndListEquivalence() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(4);

        assertTrue(LinkedListUtils.isEquivalentRepresentation(list, new int[] {1, 2, 4}));


    }

    @Test
    public void testMediumArrayAndListEquivalence() {
        ListNode    list = new ListNode(1);
                    list.next = new ListNode(2);
                    list.next.next = new ListNode(3);
                    list.next.next.next = new ListNode(4);
                    list.next.next.next.next = new ListNode(5);
                    list.next.next.next.next.next = new ListNode(6);
                    list.next.next.next.next.next.next = new ListNode(7);
                    list.next.next.next.next.next.next.next = new ListNode(8);
                    list.next.next.next.next.next.next.next.next = new ListNode(9);
                    list.next.next.next.next.next.next.next.next.next = new ListNode(10);

        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};

        assertTrue(LinkedListUtils.isEquivalentRepresentation(list, array));
    }


    @Test
    public void testLengthZeroArrayAndListEquivalence() {
        int[] array = new int[0];

        assertTrue("Expected list pointer to null to be equivalent representation of zero length array.",
                LinkedListUtils.isEquivalentRepresentation(null, array));
    }

    @Test
    public void testNullArrayAndListEquivalence() {
        assertTrue("Expected list pointer to null to be equivalent representation of array pointer to null.",
                LinkedListUtils.isEquivalentRepresentation(null, null));
    }

    @Test
    public void testLengthOneArrayAndListEquivalence() {
        ListNode list = new ListNode(1);
        int[] array = new int[] {1};

        assertTrue(LinkedListUtils.isEquivalentRepresentation(list, array));
    }

    @Test
    public void testBuildingSmallArray() {
        int[] expectedArray = new int[] {1, 2, 3, 4};
        ListNode list = LinkedListUtils.buildList(expectedArray);

        int[] generatedArray = LinkedListUtils.buildArray(list);

        assertArrayEquals(expectedArray, generatedArray);
    }

    @Test
    public void testBuildingMediumArray() {
        int[] expectedArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode list = LinkedListUtils.buildList(expectedArray);

        int[] generatedArray = LinkedListUtils.buildArray(list);

        assertArrayEquals(expectedArray, generatedArray);
    }

    @Test
    public void testGetLengthOfSmallList() {
        ListNode list = LinkedListUtils.buildList(new int[] {1, 2, 3});
        int expectedLength = 3;
        int calculatedLength = LinkedListUtils.getLength(list);

        assertEquals(expectedLength, calculatedLength);
    }

    @Test
    public void testGetLengthOfMediumList() {
        ListNode list = LinkedListUtils.buildList(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int expectedLength = 10;
        int calculatedLength = LinkedListUtils.getLength(list);

        assertEquals(expectedLength, calculatedLength);

    }

    @Test
    public void testGetLengthOfEmptyList() {
        int expectedLength = 0;
        int calculatedLength = LinkedListUtils.getLength(null);

        assertEquals(expectedLength, calculatedLength);
    }

}
