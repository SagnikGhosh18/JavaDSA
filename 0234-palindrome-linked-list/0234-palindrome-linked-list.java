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
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ArrayList<Integer> li = new ArrayList<>();
        while(node!=null){
            li.add(node.val);
            node = node.next;
        }
        
        for(int i=0;i<li.size()/2;i++){
            if( li.get(i) != li.get(li.size()-1-i) )
                return false;
        }
        return true;
    }
}