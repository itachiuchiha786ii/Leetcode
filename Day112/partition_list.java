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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next ==null){
        	return head;
        }
        ListNode curr=head;
        ListNode sdummy=new ListNode(0);
        ListNode small=sdummy;
        ListNode ldummy=new ListNode(1);
        ListNode large=ldummy;
        
        while(curr!=null){
        	if(curr.val<x){
        		ListNode temp=curr.next;
        		curr.next=null;
        		small.next=curr;
        		small=small.next;
        		curr=temp;
        	}
        	else if(curr.val>=x){
        		ListNode temp2=curr.next;
        		curr.next=null;
        		large.next=curr;
        		large=large.next;
        		curr=temp2;
        	}
        	
        }
        small.next=ldummy.next;
        small=small.next;
        return sdummy.next;
        
        
    }
}
