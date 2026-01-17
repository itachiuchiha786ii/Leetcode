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
        Stack<Integer> st=new Stack<>();
        ListNode ptr=head;
        while(ptr!=null){
            st.push(ptr.val);
            ptr=ptr.next;
        }
        ListNode nptr=head;
        while(nptr!=null){
            if(st.peek()!=nptr.val){
                return false;
            }
            st.pop();
            nptr=nptr.next;
        }
        return true;
        
    }
}
