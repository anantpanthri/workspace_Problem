package Nile;

class MinStack {

    /** initialize your data structure here. */
   
    class Node{
        Node next;
        Node head;
        int min=Integer.MAX_VALUE;
        int val;
         Node(int val){
             if(min>val)
                min=val;
             Node(head,val);
         }
		public void Node(Node next, int val){
            this.val=val;
            if(head==null){
                head=next;
            }
            else
                head.next=next;
        }
		
		public int min(){
			return min;
        }
    }
    Node head;
    public MinStack() {
      
       System.out.println(head.min());
    }
    
    public void push(int x) {
         head= new Node(x);
    }
    
    public void pop() {
    	head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
    	return head.min;
    }
}
