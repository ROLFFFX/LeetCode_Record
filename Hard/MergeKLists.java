package Hard;

public class MergeKLists {
//    You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//    Merge all the linked-lists into one sorted linked-list and return it.
    public static void main(String[] args) {
//        int[][] lists = {{1,4,5},{1,3,4},{2,6}};
        ListNode aa = new ListNode(1);
        ListNode ab = new ListNode(4);
        ListNode ac = new ListNode(5);
        aa.next = ab;
        ab.next = ac;

        ListNode ba = new ListNode(1);
        ListNode bb = new ListNode(3);
        ListNode bc = new ListNode(4);
        ba.next = bb;
        bb.next = bc;

        ListNode ca = new ListNode(2);
        ListNode cb = new ListNode(6);
        ca.next = cb;

        ListNode[] lists = {aa,ba,ca};
        ListNode ans = mergeKLists(lists);
        System.out.println();
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }
        ListNode ans = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ans = merge2Lists(ans, lists[i]);
        }
        return ans;
    }

    public static ListNode merge2Lists(ListNode l1, ListNode l2){
        // given two lists, merge them and return head of merged lists
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2; // if any list has remaining items make them the rest of list
        return dummy.next;
    }


    /** First Attempt Not Success**/
//    public static ListNode mergeKLists(ListNode[] lists) {
//        int len = lists.length;
//        if (len == 0){ return null; }
//        if (len == 1){ return lists[0]; }
//        // given len number of listNodes
//        ListNode ans = new ListNode(0);
//        while (true){
//            // iterate through fringe
//            int index_to_be_updated = 0;
//            int flag = 0;
//            int curr_min = -10000;
//            for (int i = 0; i < len; i++){
//                if (lists[i] == null){
//                    flag++;
//                    continue;
//                }
//                if (lists[i].val <= curr_min){
//                    index_to_be_updated = i;
//                    curr_min = lists[i].val;
//                }
//            }
//            if (flag >= len || lists[index_to_be_updated] == null){
//                break;
//            }
//            ans.next = new ListNode(lists[index_to_be_updated].val);
//            lists[index_to_be_updated] = lists[index_to_be_updated].next;
//        }
//        return ans.next;
//    }
}
