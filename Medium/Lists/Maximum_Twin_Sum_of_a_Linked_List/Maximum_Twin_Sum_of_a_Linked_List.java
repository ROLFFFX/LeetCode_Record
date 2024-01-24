package Medium.Lists.Maximum_Twin_Sum_of_a_Linked_List;

public class Maximum_Twin_Sum_of_a_Linked_List {
    public int pairSum(ListNode head) {
        // reverse a linked list and see max pair sum
        ListNode reversed = reverse(head);
        ListNode curr = head;
        int max = 0;
        while (curr.next != null){
            max = Math.max(max, curr.val + reversed.val);
            curr = curr.next;
            reversed = reversed.next;
        }
        return max;
    }

    // reverse linked list
    public ListNode reverse(ListNode head){
        ListNode prev = new ListNode(0);
        prev.next = null;
        ListNode curr = head;
        while (curr != null){
            ListNode newNode = new ListNode(curr.val);
            newNode.next = prev.next;
            prev.next = newNode;
            curr = curr.next;
        }
        return prev.next;
    }
}
