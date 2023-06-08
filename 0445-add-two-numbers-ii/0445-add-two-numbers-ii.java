/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode p1 = reverseList(l1), p2 = reverseList(l2), curr = head;
        while(p1!=null || p2!=null){
            int x = p1!=null ? p1.val:0;
            int y = p2!=null ? p2.val:0;
            int sum = carry + x+y;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        if(carry>0)
            curr.next = new ListNode(carry);
        return reverseList(head.next);
    }
    public ListNode reverseList(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}