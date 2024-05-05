package Medium.Lists;

public class Delete_Node_in_a_Linked_LIst {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
