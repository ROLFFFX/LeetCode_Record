package Medium.Reverse_Linked_List_2;

public class Reverse_Linked_List_2 {
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int c = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // list becomes 0 indexed
        ListNode curr = dummy;
        // traverse list, store start and tail
        ListNode start = null;
        ListNode tail = null;
        while (curr != null){
            if (c == left - 1){
                start = curr;
            } else if (c == right){
                tail = curr.next;
            }
            curr = curr.next;
            c++;

        }
        ListNode reverse_start = reverseNTimes(start.next, right-left);
        start.next = reverse_start;
        while (reverse_start.next != null){
            reverse_start = reverse_start.next;
        }
        reverse_start.next = tail;
        return dummy.next;
    }

    // helper function that reverse the given list N times, return head
    public ListNode reverseNTimes(ListNode head, int n){
        ListNode prev = null;
        int c = 0;
        ListNode curr = head;
        while (c <= n){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }
        return prev;
    }
}

