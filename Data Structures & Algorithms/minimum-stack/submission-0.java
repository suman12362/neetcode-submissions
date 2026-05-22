class MinStack {
    private Stack<Integer> sb;
    private Stack<Integer> minsb;
    public MinStack() {
        sb = new Stack<>();
        minsb = new Stack<>();
    }
    
    public void push(int val) {
        sb.push(val);
        if(minsb.isEmpty())
        {
         minsb.push(val);
        }else{
           if(minsb.peek() >= val)
             minsb.push(val);
           else
            minsb.push(minsb.peek());
        }
    }
    
    public void pop() {
        sb.pop();
        minsb.pop();
    }
    
    public int top() {
        return sb.peek();

    }
    
    public int getMin() {
        return minsb.peek();
    }
}
