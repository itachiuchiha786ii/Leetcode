class Solution {

    public int size(ListNode head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return head;

        int n = size(head);

     
        ListNode node1 = head;
        for(int i = 1; i < k; i++){
            node1 = node1.next;
        }

        
        int posFromStart = n - k + 1;
        ListNode node2 = head;
        for(int i = 1; i < posFromStart; i++){
            node2 = node2.next;
        }

        
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;

        return head;
    }
}
