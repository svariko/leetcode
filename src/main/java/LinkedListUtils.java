package main.java;

import main.java.ListNode;

public class LinkedListUtils {


    public static ListNode buildList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode lastNode = head;

        for (int i = 1; i < array.length; i++) {
            ListNode current = new ListNode(array[i]);
            lastNode.next = current;
            lastNode = current;
        }

        return head;

    }


    public static int getLength(ListNode list) {
        if (list == null) {
            return 0;
        }

        int length = 0;
        ListNode current = list;

        while (current != null) {
            length += 1;
            current = current.next;
        }
        return length;

    }



    public static int[] buildArray(ListNode list) {
        int length = getLength(list);
        int[] array = new int[length];

        ListNode current = list;

        for (int i = 0; i < array.length; i++) {
            array[i] = current.val;
            current = current.next;
        }

        return array;

    }


    public static boolean isEquivalentRepresentation(ListNode list, int[] array) {
        if (array == null && list == null) {
            return true;
        }
        if (array.length == 0 && list == null) {
            return true;
        }

        boolean isValid = true;

        ListNode current = list;
        for (int val: array) {
            if (current == null || val != current.val) {
                isValid = false;
                break;
            }
            current = current.next;
        }

        return isValid;
    }

}
