class MyStack {
	private Queue<Integer> m;
	private Queue<Integer> h;

    public MyStack() {
        m=new LinkedList<>();
        h=new  LinkedList<>();
    }
    
    public void push(int x) {
        while(m.size()>0){
        	h.add(m.remove());
        }
        m.add(x);
        while(h.size()>0){
        	m.add(h.remove());
        }
    }
    
    
    public int pop() {
        return m.remove();
    }
    
    public int top() {
        return m.peek();
        
    }
    
    public boolean empty() {
        if(m.size()==0){
        	return true;
        }else{
        	return false;
        }
    }
}
