/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        
        while(b!=null){
            while(a!=null){
                if(a==b)
                    return a;
                else
                    a=a.next;
            }
            a = headA;
            b = b.next;
        }
        return a==null?a:b;
    }
}