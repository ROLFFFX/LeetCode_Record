package Medium.Remove_Nth_Node_From_End_of_List;

import java.util.List;

public class Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;
        ListNode ans = removeNthFromEnd(one,2);
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        int sz = size_of_list(head);
        int index_removed = sz - n;
        // edge case
        if (head.next == null && n >= 1){
            return null;
        }
        if (index_removed < 0){
            return null;
        }
        if (index_removed == 0){
            return head.next;
        }
        // traverse list
        int count = 0;
        ListNode curr = head;
        for (int i = 1; i < index_removed; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    private static int size_of_list(ListNode head){
        if (head.next == null){
            return 1;
        }
        int count = 1;
        while (head.next != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

