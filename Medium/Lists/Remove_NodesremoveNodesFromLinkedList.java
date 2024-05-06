package Medium.Lists;

public class Remove_NodesremoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        // greater value anywhere to the right side of int
        if (head == null) return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }
}
