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
    public int sizell(ListNode head){
    	int count=0;
    	ListNode curr=head;
    	while(curr!=null){
    		count++;
    		curr=curr.next;
    	}
    	return count;
    }
    public ListNode reverse(ListNode head){
    	ListNode prev=null;
    	ListNode curr=head;
    	while(curr !=null){
    		ListNode temp=curr.next;
    		
    		curr.next=prev;
    		prev=curr;
    		curr=temp;
    	}
    	return prev;
    }
    		
    public int[] nextLargerNodes(ListNode head) {
        int size=sizell(head);
        int[] ans=new int[size];
        ListNode nh=reverse(head);
        Stack<Integer> st=new Stack<>();
        st.push(nh.val);
        ListNode curr=nh.next;
        int ptr=size-2;
        while(ptr>=0){
        	int e=curr.val;
        	curr=curr.next;
        	
        	while(st.size()>0 && st.peek()<=e){
        		st.pop();
        	}
        	
        	if(st.size()==0){
        		ans[ptr]=0;
        	}else{
        		ans[ptr]=st.peek();
        	}
        	st.push(e);
        	ptr--;
        }
        return ans;
    }
}
