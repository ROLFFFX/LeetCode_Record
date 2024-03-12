package Medium.Lists;

import java.util.HashMap;

public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {
    public ListNode removeZeroSumSublists(ListNode head) {

        /*
        Approach: The idea is, if we calculate sum of values from start and if A and B nodes are having few zero sum nodes
                  between them, they will have the same sum. Eg: In [2,4,2,-6,7], node 2 and node -6 both are having sum as
                  2, so we can connect node 2 to node 7, essentially removing zero-sum nodes [4,2,-6] from the list.
                  Have a HashMap (sumNodeMap) of node and sum till that node (sum --> node).
                  Need to have a dummy head node, to handle in case the head should be deleted as it is zero sum,
                  eg in [1,-1,4,3].
                  Traverse the Linked List. In each node, calculate the sum. If the sum exists in sumNodeMap, that means
                  the nodes between when we found the same sum and current node are zero sum. So get that old node and point
                  to next node of current node (essentially remving in-between zero-sum nodes). Also, remove those in-between
                  nodes from sumNodeMap, to make sure that we don't use the old removed node again in future. Note that
                  this removing process can run for max n (number of nodes) times in total. Thus doesn't affect the
                  O(n) time complexity of the whole program.

        Complexity analysis: Time: O(n), Space: O(n)
        */

        HashMap<Integer, ListNode> sumNodeMap = new HashMap<>();

        ListNode dummyPreHead = new ListNode(0);
        dummyPreHead.next = head;

        sumNodeMap.put(0, dummyPreHead);                                    //Init the stack with prehead.

        ListNode currNode = head;

        int sum = 0;

        while(currNode!=null){

            sum += currNode.val;

            if(sumNodeMap.containsKey(sum)){

                ListNode oldNodeWithSameSum = sumNodeMap.get(sum);          //Old node with same sum

                ListNode toBeRemovedNode = oldNodeWithSameSum.next;         //Remove zero-sum in-between nodes from sumNodeMap
                int toBeRemovedSum = sum;
                while(toBeRemovedNode != currNode){
                    toBeRemovedSum = toBeRemovedSum + toBeRemovedNode.val;
                    sumNodeMap.remove(toBeRemovedSum);
                    toBeRemovedNode = toBeRemovedNode.next;
                }
                oldNodeWithSameSum.next = currNode.next;                    //Point old node to current next node
            }
            else{
                sumNodeMap.put(sum, currNode);
            }

            currNode = currNode.next;
        }

        return dummyPreHead.next;
    }
}
