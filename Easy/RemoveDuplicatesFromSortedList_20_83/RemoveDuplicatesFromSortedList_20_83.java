package Easy.RemoveDuplicatesFromSortedList_20_83;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedList_20_83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(1);
        head.next = ln1;
        ln1.next = ln2;

        ListNode ans = deleteDuplicates(head);
        System.out.println();   //check ans
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){return head;}    //edge case: one or no item
        ListNode temp_node = head;
        while (temp_node.next!=null){   //when tempnode is not null, keep iterating itself
            int curr_value = temp_node.val;
            ListNode next_node = findNextPossibleNode(temp_node, curr_value);
            temp_node.next = next_node;
            temp_node = next_node;
        }
        //at this point, temp_node.next is null, temp_node is the last node to be inspected.
        return head;
    }

    public static ListNode findNextPossibleNode(ListNode temp, int curr_val){
        ListNode curr_node = temp;
        while (curr_node.next != null){

        }
        return temp;
    }
}
