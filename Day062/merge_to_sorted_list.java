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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode nlist=new ListNode(-1);
        ListNode ans=nlist;
        while(l1 !=null && l2 != null){
            if(l1.val < l2.val){
                nlist.next=l1;
                l1=l1.next;
            }else{
                nlist.next=l2;
                l2=l2.next;
            }
            nlist=nlist.next;  
        }
        if(l2==null){
            nlist.next=l1;
        }else{
            nlist.next=l2;
        }
        return ans.next;
        
    }
}
