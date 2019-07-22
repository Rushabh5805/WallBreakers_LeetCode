class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int top;
    int flag;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        top=0;
        flag=0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(flag==0){
            top=x;
            flag=1;
        }
        s1.push(x);
        System.out.println("push");
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int x = s2.pop();
        if(!s2.empty())
            top = s2.peek();
        else flag=0;
        //System.out.println("pop");
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        
        return x;
    }
    
    /** Get the front element. */
    public int peek() {

        return top;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        System.out.println("empty");
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
