package Easy.Palindrome_Linked_List;

import java.util.Stack;

public class Palindrome_Linked_List {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        a.next = b;
        b.next = c;
        System.out.println(isPalindrome(a));

    }
    public static boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        Stack<Integer> stack = new Stack();
        while (curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        while (head != null){
            int reverse_val = stack.pop();
            if(head.val != reverse_val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
