package Easy.Remove_Linked_List_Elements;


public class Remove_Linked_List_Elements {
    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        boolean flag = test.next == null;
        System.out.println();
        removeElements(test, 1);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null){ return null; }
        ListNode dummy = new ListNode();
        dummy.next = head;
        head = dummy;
        ListNode ans = head;
        while (head.next != null){
            if (head.next.val == val){
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return ans;
    }

/** Success but noe optimized**/
//    public static ListNode removeElements(ListNode head, int val) {
//        if (head == null){ return null; }
//        if (head.next == null){
//            ListNode ret = (head.val == val) ? null : head;
//            return ret;
//        }
//        // else traverse list
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        head = dummy;
//        ListNode ans = head;
//        while (head.next.next != null){
//            if (head.next.val == val){
//                head.next = head.next.next;
//                continue;
//            }
//            if (head.next != null){
//                head = head.next;
//            } else {
//                break;
//            }
//
//        }
//        if (head.next.val == val){
//            head.next = null;
//        }
//        return ans.next;
//    }
}
