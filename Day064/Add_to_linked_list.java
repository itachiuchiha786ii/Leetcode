class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
        	return l2;
        }else if(l2== null){
        	return l1;
        }
        
        ListNode nlist=new ListNode(-1);
        ListNode ans=nlist;
        ListNode ptr1=l1;
        ListNode ptr2=l2;
        int carry=0;
        while(ptr1 != null || ptr2 != null){
        	int val1=ptr1 != null ? ptr1.val:0;
        	int val2=ptr2 != null ? ptr2.val:0;
        	
        	int sum= val1+val2+carry;
        	int ap=sum%10;
        	carry=sum/10;
        	
        	
        	ListNode temp=new ListNode(ap);
        	nlist.next=temp;
        	nlist=nlist.next;
        	
        	ptr1=ptr1 != null ? ptr1.next:null;
        	ptr2=ptr2 != null ? ptr2.next:null;
        }
        if(carry >0){
        	ListNode temp=new ListNode(carry);
        	nlist.next=temp;
        	nlist=nlist.next;
        }
        return ans.next;
        
    }
}
