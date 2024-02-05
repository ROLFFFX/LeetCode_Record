package Medium.Lists;

public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int count = 1;
        ListNode tail = head;
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        // Connect the tail to the head to make it circular
        tail.next = head;

        int rotations = k % count;
        int stepsToNewHead = count - rotations;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewHead - 1; i++) {
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
}
