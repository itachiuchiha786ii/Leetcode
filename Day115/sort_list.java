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
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
       ArrayList<Integer> sortt=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        sortt.add(temp.val);
        temp=temp.next;
       }
       Collections.sort(sortt);
       ListNode dummy=new ListNode(1);
       dummy.next=head;
       ListNode curr=dummy;
        curr=curr.next;
       int i=0;
       while(curr!=null && i < sortt.size()){
        curr.val=sortt.get(i);
        curr=curr.next;
        i++;
       }
       return dummy.next;
        
        
        
    }
}
