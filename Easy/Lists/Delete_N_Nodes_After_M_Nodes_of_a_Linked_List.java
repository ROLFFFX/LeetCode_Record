package Easy.Lists;

public class Delete_N_Nodes_After_M_Nodes_of_a_Linked_List {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0); // A dummy node to help with edge cases.
        dummy.next = head;
        ListNode current = dummy; // Use current to traverse the list.

        while (current.next != null) {
            for (int i = 0; i < m && current.next != null; i++) {
                current = current.next;
            }
            ListNode last = current;
            for (int i = 0; i < n && last.next != null; i++) {
                last = last.next;
            }

            current.next = last.next;
        }

        return dummy.next;
    }
}
