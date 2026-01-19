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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }
        ListNode nlist=new ListNode(head.val);
        ListNode ans=nlist;
        ListNode ptr=head.next;
        while(ptr != null){
            if(ptr.val != nlist.val){
                nlist.next=ptr;
                 nlist=nlist.next; 
            }
            ptr=ptr.next;
          
        }
        nlist.next=null; 
        return ans;
    }
}
