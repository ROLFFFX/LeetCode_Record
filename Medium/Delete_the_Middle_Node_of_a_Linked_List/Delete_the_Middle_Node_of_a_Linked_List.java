package Medium.Delete_the_Middle_Node_of_a_Linked_List;

public class Delete_the_Middle_Node_of_a_Linked_List {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        } else if (head.next.next == null){
            head.next = null;
            return head;
        }
        // two pointers
        ListNode fast = head;
        ListNode prev = null;
        ListNode slow = head;
        int count = 0;
        while (fast.next != null && fast.next.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        if (fast.next != null){
            slow.next = slow.next.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }
}
