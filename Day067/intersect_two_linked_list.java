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
    public int sizell(ListNode head){
    	int count=0;
    	while(head!=null){
    		head=head.next;
    		count++;
    	}
    	return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
        	return null;
        }
        int sizeA=sizell(headA);
        int sizeB=sizell(headB);
        int diff=sizeA-sizeB;
        
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        if(diff>0){
        	while(diff>0){
        		diff--;
        		ptr1=ptr1.next;
        	}
        }else{
        	while(diff<0){
        		diff++;
        		ptr2=ptr2.next;
        	}
        }
        
        while(ptr1!=ptr2){
        	ptr1=ptr1.next;
        	ptr2=ptr2.next;
        }
        return ptr1;
        	
    }
}
