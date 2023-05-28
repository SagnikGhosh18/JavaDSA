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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null)
            return head;
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            li.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> rli = new ArrayList<>();
        k = k%li.size();
        for(int i=0;i<li.size();i++){
            if(i<k)
                rli.add(li.get(i+li.size()-k));
            else
                rli.add(li.get(i-k));
        }
        ListNode node = head;
        int i=0;
        while(node!=null){
            node.val = rli.get(i++);
            node = node.next;
        }
        return head;
    }
}