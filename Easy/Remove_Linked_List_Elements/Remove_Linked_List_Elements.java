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
        ListNode dummy = head;
        while (true){

        }
    }



//    public static ListNode removeElements(ListNode head, int val) {
//        if (head == null){ return null; }
//        if (head.next == null){
//            ListNode ret = (head.val == val) ? null : head;
//            return ret;
//        }
//        // else traverse list
//        ListNode dummy = head;
//        while (head.next != null){
//            if (head.next.val == val){
//                head.next = head.next.next;
//            }
//            if (head.next != null){
//                head = head.next;
//            } else {
//                break;
//            }
//
//        }
//        return dummy;
//    }
}
