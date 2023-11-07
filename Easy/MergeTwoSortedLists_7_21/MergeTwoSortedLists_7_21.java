package Easy.MergeTwoSortedLists_7_21;
public class MergeTwoSortedLists_7_21 {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ln1.next = ln3;
        ln3.next = ln4;

        ListNode ln2_1 = new ListNode(1);
        ListNode ln2_2 = new ListNode(2);
        ListNode ln2_3 = new ListNode(3);
        ListNode ln2_66 = new ListNode(66);
        ListNode ln2_100 = new ListNode(100);

        ln2_1.next = ln2_2;
        ln2_2.next = ln2_3;
        ln2_3.next = ln2_66;
        ln2_66.next = ln2_100;

        ListNode ln_ans = mergeTwoLists(ln1, ln2_1);

        while (ln_ans != null) {
            System.out.print(ln_ans.val + " ");
            ln_ans = ln_ans.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode ret_node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ret_node.next = list1;
                list1 = list1.next;
            }
            else {
                ret_node.next = list2;
                list2 = list2.next;
            }
            ret_node = ret_node.next;
        }

        if (list1 != null) {
            ret_node.next = list1;
        }

        if (list2 != null) {
            ret_node.next = list2;
        }

        return dummy.next;
    }
}
