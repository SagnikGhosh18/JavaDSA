/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode a = head;
        while(a!=null){
            if(set.contains(a))
                return a;
            else{
                set.add(a);
                a = a.next;
            }
        }
        return null;
    }
}