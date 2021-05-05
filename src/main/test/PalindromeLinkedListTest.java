package main.test;

import main.java.PalindromeLinkedList;
import main.java.LinkedListUtils;
import main.java.ListNode;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PalindromeLinkedListTest {
    private PalindromeLinkedList palindromeLinkedList;

    @Before
    public void setUp() {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void testSmallPalindrome() {
        ListNode list = LinkedListUtils.buildList(new int[] {1,2,2,1});

        assertTrue(palindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testSmallNonPalindrome() {
        ListNode list = LinkedListUtils.buildList(new int[] {1,2});

        assertFalse(palindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testSingleNodeList() {
        ListNode list = LinkedListUtils.buildList(new int[] {1});

        assertTrue(palindromeLinkedList.isPalindrome(list));
    }

    @Test
    public void testNullList() {
        assertFalse(palindromeLinkedList.isPalindrome(null));
    }
}
