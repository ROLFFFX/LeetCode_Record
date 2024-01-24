package Medium.Lists.AddTwoNumbers_11_2;

public class AddTwoNumbers_11_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1.next = l1_2;
        l1_2.next = l1_3;
        //First Linked List
        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
//        ListNode l2_4 = new ListNode(5);
        l2.next = l2_2;
        l2_2.next = l2_3;
//        l2_3.next = l2_4;
        //Second Linked List;
//        ListNode reversed_l2 = reverse(l2);
        ListNode ans = addTwoNumbers(l1, l2);
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        ListNode reverse_l1 = reverse(l1);
////        ListNode reverse_l2 = reverse(l2);
////        //adding
////        int l1_length = getDepth(l1);
////        int l2_length = getDepth(l2);
////
////
////        return new ListNode(0);
//        ListNode dummyHead = new ListNode(0);
//        ListNode current = dummyHead;
//        int carry = 0;
//
//        while (l1 != null || l2 != null) {
//            int x = (l1 != null) ? l1.val : 0;
//            int y = (l2 != null) ? l2.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            current.next = new ListNode(sum % 10);
//            current = current.next;
//
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//
//        if (carry > 0) {
//            current.next = new ListNode(carry);
//        }
//
//        return dummyHead.next;
//    }



    public static ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode current = l;

        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

//    public static ListNode reverse(ListNode l){
//        ListNode ans = new ListNode();
//        int l_depth = getDepth(l);
//
//        for (int i = l_depth - 1; i >= 0; i--) { //i represents how many .next it needs.
//            int c = i;
//            ListNode temp = l;
//            while (c > 0){
//                temp = temp.next;
//                c--;
//            }
//            //at this point temp is the correct list to be added
//            ans.next = temp;
//        }
//
//        return ans;
//    }

    public static int getDepth(ListNode l){
        int c = 0;
        while (l.next != null){
            l = l.next;
            c++;
        }
        return c+1;
    }
}
