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
        if(head == null || head.next == null || head.next.next == null){
        	return head;
        }
        ListNode oddh=head;
        ListNode evenh=head.next;
        ListNode evn=evenh;
        while(evenh != null && evenh.next != null){
        	oddh.next=oddh.next.next;
        	evenh.next=evenh.next.next;
        	
        	oddh=oddh.next;
        	evenh=evenh.next;
        }
        oddh.next=evn;
        return head;
    }
}
