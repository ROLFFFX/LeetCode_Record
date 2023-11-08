package Easy.Reverse_Linked_List;

import java.util.List;

public class Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        head.next = two;
        two.next = three;
        three.next = four;
        ListNode ans = reverseList(head);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){           //curr = 1
            ListNode next = curr.next;  //next = 2
            curr.next = prev;           //prev = 2
            prev = curr;                //prev = 1
            curr = next;                //curr = 2
        }
        return prev;
    }
}
