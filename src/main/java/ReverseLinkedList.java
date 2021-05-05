package main.java;

import main.java.ListNode;


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode aheadOne = current.next;
        while (aheadOne != null) {
            ListNode aheadTwo = aheadOne.next;
            aheadOne.next = current;
            current = aheadOne;
            aheadOne = aheadTwo;
        }
        head.next = null;
        return current;
    }

}
