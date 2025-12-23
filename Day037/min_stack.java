class MinStack {
     private Stack<Integer> st;
     private Stack<Integer> min;
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if(st.size()==0 || min.peek()>=val){
            min.push(val);
        }

          st.push(val);
    }

    public void pop() {
        int ste = st.pop();
        int minp = min.peek();

        if(ste==minp){
            min.pop();
        }

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
