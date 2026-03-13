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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next ==null ){
        	return head;
        }
        
        ListNode first=head;
        ListNode second=head.next;
        while(second!=null){
        	if(second.val>=first.val){
        		first=second;
        		second=second.next;
        		continue;
        	}
        	first.next=second.next;
            ListNode prev=null;
        	ListNode in=head;
        	while(in!=first.next){
        		if(in.val>=second.val){
        			break;
        		}
        		prev=in;
        		in=in.next;
        	}
        	if(prev==null){
        		second.next=head;
        		head=second;
        	}else{
        		second.next=prev.next;
        		prev.next=second;
        	}
        	second=first.next;
        }
        return head;
        		
        
    }
} 
