package Medium.Remove_Nodes_From_Linked_List;

public class Remove_Nodes_From_Linked_List {
    public ListNode removeNodes(ListNode head) {
        ListNode reversed = reverse(head);
        ListNode dummy = new ListNode(0, reversed);
        ListNode curr = dummy;

        while (curr.next != null) {
            ListNode temp = curr.next;
            while (temp.next != null && temp.next.val < curr.next.val) {
                temp.next = temp.next.next;
            }
            curr = curr.next;
        }

        return reverse(dummy.next);

    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
