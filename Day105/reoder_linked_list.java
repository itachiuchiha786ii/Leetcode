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
    public ListNode revers(ListNode head){
		
		ListNode curr=head;
		ListNode prev=null;
		ListNode save=null;
		
		while(curr!=null){
			save=curr.next;
			curr.next=prev;
			prev=curr;
			curr=save;
			
		}
		return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast=head;
		ListNode slow=head;
		while(fast !=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		ListNode mid=revers(slow.next);
		slow.next=null;
		ListNode dummy=head;
		while(mid !=null){
			ListNode temp1=dummy.next;
			ListNode temp2=mid.next;
			 dummy.next=mid;
			 mid.next=temp1;
			 dummy=temp1;
			 mid=temp2;
        }
    }
}
