package Easy.Lists.Linked_List_Cycle;

import java.util.ArrayList;
import java.util.HashSet;

public class Linked_List_Cycle {
    public static void main(String[] args) {
        /** Test Cases **/
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode forth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = second;

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        System.out.println(hasCycle(first));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null){ return false; }
        ArrayList<ListNode> r = new ArrayList<>();
        while (head.next != null){
            if (r.contains(head)){
                return true;
            } else {
                r.add(head);
            }
            head = head.next;

        }
        return false;
    }

    /** First Attempt, success but slow**/

    public static boolean hasCycle_First(ListNode head) {
        if (head == null){
            return false;
        }
        HashSet<ListNode> exist = new HashSet<>();
        while (head.next != null){
            int exist_size = exist.size();
            ListNode next = head.next;
            exist.add(next);
            if (exist.size() == exist_size){
                return true;
            }
            head = next;
        }
        return false;
    }
}
