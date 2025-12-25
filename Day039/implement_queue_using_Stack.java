class MyQueue {
	private Stack<Integer> m;
	private Stack<Integer> h;
    public MyQueue() {
        m=new Stack<>();
        h=new Stack<>();
    }
    
    public void push(int x) {
        while(m.size()>0){
        	h.push(m.pop());
        }
        m.push(x);
        while(h.size()>0){
        	m.push(h.pop());
        }
    }
    
    public int pop() {
        return m.pop();
    }
    
    public int peek() {
        return m.peek();
    }
    
    public boolean empty() {
        return m.size()==0;
    }
}
