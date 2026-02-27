class linkedlist{
public class Listnode{
	Listnode next;
	int val;
	public Listnode(int val){
		this.val=val;
	}
}
	static Listnode head=null;
	Listnode tail=null;
	Listnode curr=head;
	public void createnode(int val){
		Listnode newnode=new Listnode(val);
		if(head==null || tail==null){
			head=newnode;
			tail=newnode;
		}
		tail.next=newnode;
		newnode.next=null;
		tail=newnode;
	}
	public void displaynode(Listnode newhead){
		curr=newhead;
		while(curr!=null){
			System.out.println(curr.val);
			curr=curr.next;
		}
	}
	public void insert(int index,int val){
		curr=head;
		int count=1;
		while(curr!=null && index-1 != count){
			curr=curr.next;
			count++;
		}
		Listnode newnode=new Listnode(val);
				Listnode temp=curr.next;
				curr.next=newnode;
				newnode.next=temp;
				
	}
	
	public void reversell(Listnode head){
				curr=head;
				Listnode prev=null;
				Listnode save=null;
				while(curr!=null){
					save=curr.next;
					curr.next=prev;
					prev=curr;
					curr=save;
				}
				displaynode(prev);
	}
				
				
	public static void main(String args[]){
		linkedlist l1=new linkedlist();
		l1.createnode(10);
		l1.createnode(20);
		l1.createnode(30);
		l1.createnode(40);
		l1.createnode(50);
		l1.displaynode(head);
		l1.insert(3,25);
		System.out.print("--++++---\n");
		l1.displaynode(head);
		System.out.print("--++++---\n");
		l1.reversell(head);
		
	
	
	}

}
		
