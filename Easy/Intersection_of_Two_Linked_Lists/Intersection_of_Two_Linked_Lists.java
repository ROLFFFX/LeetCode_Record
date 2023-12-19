package Easy.Intersection_of_Two_Linked_Lists;

import java.util.HashSet;

public class Intersection_of_Two_Linked_Lists {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode i3 = new ListNode(3);
        ListNode i4 = new ListNode(4);
        ListNode b1 = new ListNode(5);
        a1.next = a2;
        a2.next = i3;
        i3.next = i4;
        b1.next = i3;
        ListNode ans = getIntersectionNode(a1, b1); // should get i3
        System.out.println(ans.val);    // should get 3

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    }
}
