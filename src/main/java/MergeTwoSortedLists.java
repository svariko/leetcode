package main.java;

import main.java.ListNode;

import java.util.ArrayList;


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }


        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode merged;
        ListNode current;

        if (p1.val <= p2. val) {
            merged = p1;
            current = merged;
            p1 = p1.next;
        } else {
            merged = p2;
            current = merged;
            p2 = p2.next;
        }

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
                current = current.next;
            } else {
                current.next = p2;
                p2 = p2.next;
                current = current.next;
            }

        }

        if (p1 != null) {
            current.next = p1;
        }

        if (p2 != null) {
            current.next = p2;
        }

        return merged;

    }







}
