class Solution {
    public ListNode revll(ListNode head){
    	ListNode curr=head;
    	ListNode prev=null;
    	while(curr!=null){
    	ListNode temp=curr.next;
    	curr.next=prev;
    	prev=curr;
    	curr=temp;
    	
    	}
    	return prev;
    }
    
    public ListNode doubleIt(ListNode head) {
        ListNode ptr=revll(head);
        ListNode ptr1=new ListNode(-1);
        ListNode ans=ptr1;
        int carry=0;
        while(ptr != null){
        	int sum=ptr.val+ptr.val+carry;
        	int rem=sum%10;
        	carry=sum/10;
        	
        	ListNode temp=new ListNode(rem);
        	ptr1.next=temp;
        	ptr1=ptr1.next;
        	ptr=ptr.next;
    }
    if(carry>0){
    	ListNode temp=new ListNode(carry);
    	ptr1.next=temp;
    }
    ans=revll(ans.next);
    return ans;
    }
}
