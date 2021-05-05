package main.java;

public class RemoveNthFromEnd {
    public int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }

        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            length += 1;
            current = current.next;
        }
        return length;

    }

    public int getIndexToDelete(ListNode head, int n) {
        int length = getLength(head);
        return length - n;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || getLength(head) == 1) {
            return null;
        }
        ListNode newHead = head;
        int index = getIndexToDelete(head, n);
        if (index == 0) {
            newHead = head.next;
        }
        ListNode previous = head;
        int i = 0;
        while (i < index - 1) {
            previous = previous.next;
            i += 1;
        }
        ListNode toDelete = previous.next;
        previous.next = toDelete.next;
        return newHead;
    }
}
