package Medium.Odd_Even_Linked_List;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        // edge cases: less than 2 nodes
        if (head == null || head.next == null){
            return head;
        }
        // traverse list and alternate between odd and even
        // keep track of even nodes
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head = even;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        // link the end of odd list to start of even list
        odd.next = even_head;
        return head;
    }
}
