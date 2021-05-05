package main.java;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    private boolean checkIfPalindrome(ListNode l1, ListNode l2) {
       while (l1 != null && l2 != null) {
           if (l1.val != l2.val) {
               return false;
           }
           l1 = l1.next;
           l2 = l2.next;
       }

       return true;

    }

    private ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode forwardOne = current.next;
        ListNode forwardTwo = forwardOne.next;

        head.next = null;

        while (forwardOne != null) {
            forwardOne.next = current;
            current = forwardOne;
            forwardOne = forwardTwo;
            if (forwardTwo != null) {
                forwardTwo = forwardTwo.next;
            }
        }

        return current;
    }

    private ListNode getFirstHalfEnd(ListNode head, int firstHalfEndIndex) {

        int i = 1;
        ListNode firstHalfEnd = head;
        while (i < firstHalfEndIndex) {
            firstHalfEnd = firstHalfEnd.next;
            i += 1;
        }
        return firstHalfEnd;

    }

    private ListNode getSecondHalfStart(ListNode head, int secondHalfStartIndex) {
        int i = 1;
        ListNode secondHalfStart = head;
        while (i < secondHalfStartIndex) {
            secondHalfStart = secondHalfStart.next;
            i += 1;
        }
        return secondHalfStart;
    }

    private List<ListNode> splitAndReverseSecondHalf(ListNode head) {

        int length = LinkedListUtils.getLength(head);
        int firstHalfEndIndex, secondHalfStartIndex;
        if (length % 2 == 0) {
            firstHalfEndIndex = length / 2;
            secondHalfStartIndex = firstHalfEndIndex + 1;
        }
        else {
            firstHalfEndIndex = length / 2;
            secondHalfStartIndex = firstHalfEndIndex + 2;
        }

        ListNode firstHalfEnd = getFirstHalfEnd(head, firstHalfEndIndex);


        ListNode secondHalfStart = getSecondHalfStart(head, secondHalfStartIndex);
        ListNode secondHalfReversed = reverseList(secondHalfStart);

        List<ListNode> lists = new ArrayList<>();
        lists.add(head);
        firstHalfEnd.next = null;
        lists.add(secondHalfReversed);

        return lists;

    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }

        List<ListNode> lists = splitAndReverseSecondHalf(head);

        ListNode firstHalf = lists.get(0);
        ListNode secondHalfReversed = lists.get(1);

        return checkIfPalindrome(firstHalf, secondHalfReversed);

    }
}
