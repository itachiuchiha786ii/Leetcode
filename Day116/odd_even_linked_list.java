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
    public ListNode oddEvenList(ListNode head) {
        if(head==null && head.next==null){
        	return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode even=fast;
        while(fast!=null){
           slow.next=fast.next;
           slow=slow.next;
           
           fast.next=slow.next;
           
           fast=fast.next;
        }
        slow.next=even;
            
            
        return head;
    }
}
