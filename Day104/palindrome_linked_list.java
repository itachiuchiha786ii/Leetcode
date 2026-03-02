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
        if(head==null || head.next ==null){
			return true;
		}
			Stack<Integer> list=new Stack<>();
			ListNode curr=head;
			while(curr!=null){
				list.push(curr.val);
				curr=curr.next;
			}
			curr=head;
			
			
			while(curr!=null){
				int val=list.pop();
				if(curr.val==val){
					curr=curr.next;
				}else{
					return false;
				}
			}
			return true;
    }
}
