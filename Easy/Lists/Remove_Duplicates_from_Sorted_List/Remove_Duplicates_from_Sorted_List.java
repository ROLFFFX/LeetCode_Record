package Easy.Lists.Remove_Duplicates_from_Sorted_List;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        while (curr != null || curr.next!=null){
            if (curr.next == null){
                break;
            }
            if (curr.next.val == curr.val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
