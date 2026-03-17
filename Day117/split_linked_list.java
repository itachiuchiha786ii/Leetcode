class Solution {
    public int size(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] part = new ListNode[k];
        int n = size(head);
        int minPart = n / k;
        int rem = n % k;
        ListNode curr = head;
        
        for(int i = 0; i < k; i++){
            ListNode headOfPart = curr;
            int partSize = minPart + (i < rem ? 1 : 0);
            for(int j = 0; j < partSize - 1; j++){
                if(curr != null){
                    curr = curr.next;
                }
            }
            if(curr != null){
                ListNode nextPart = curr.next;
                curr.next = null;
                curr = nextPart;
            }
            part[i] = headOfPart;
        }
        
        return part;
    }
}
