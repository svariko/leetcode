package main.test;

import main.java.RemoveNthFromEnd;
import main.java.ListNode;
import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.*;

public class RemoveNthFromEndTest {
    private RemoveNthFromEnd removeNthFromEnd;

    @Before
    public void setUp() {
        removeNthFromEnd = new RemoveNthFromEnd();
    }

    @Test
    public void testGetListLengthValid() {
        ListNode tail = new ListNode(5);
        ListNode secondLast = new ListNode(4, tail);
        ListNode thirdLast = new ListNode(3, secondLast);
        ListNode fourthLast = new ListNode(2, thirdLast);
        ListNode head = new ListNode(1, fourthLast);
        int expectedLength = 5;

        assertEquals(expectedLength, removeNthFromEnd.getLength(head));
    }

    @Test
    public void testGetListLengthInvalid() {
        int expectedLength = 0;
        assertEquals(expectedLength, removeNthFromEnd.getLength(null));
    }

    @Test
    public void testGetIndexToDelete() {
        ListNode tail = new ListNode(5);
        ListNode secondLast = new ListNode(4, tail);
        ListNode thirdLast = new ListNode(3, secondLast);
        ListNode fourthLast = new ListNode(2, thirdLast);
        ListNode head = new ListNode(1, fourthLast);
        int n = 2;
        int expectedIndex = 3;
        assertEquals(expectedIndex, removeNthFromEnd.getIndexToDelete(head, n));

    }



}
