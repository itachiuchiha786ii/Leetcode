public class Main {
	public static void main(String[] args) {
		if(head==null) return head;
		dfs(head);
		return head;
	}
	public Node dfs(Node head){
		Node curr=head;
		Node last=null;
		while(curr!=null){
			Node next=curr.next;
			//if child exist
			if(curr.child!=null){
				Node childlast=dfs(curr.child);
				//connect to curr.next to child
				curr.next=curr.child;
				curr.child.prev=curr;
				//if next exist then connet childlast to next
				if(next!=null){
					childlast.next=next;
					next.prev=childlast;
				}
				curr.child=null;
				last=childlast;
			}else{
				last=curr;
			}
			curr=next;
		}
		return last;
	}
				
				
}
/*1 <-> 2 <-> 3
      |
      7 <-> 8
           |
           11
