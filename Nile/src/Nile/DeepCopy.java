package Nile;

public class DeepCopy {
	public static RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)return null;
       RandomListNode currNode=head;
        //make conjoined lists
        while(currNode!=null){
            RandomListNode temp= new RandomListNode(currNode.label);
            temp.next=currNode.next;
            currNode.next=temp;
            currNode=currNode.next.next;
        }
        //randomPointers check
        currNode=head;
        while(currNode!=null){
            if(currNode.random==null)
                currNode.next.random=null;
            else
            currNode.next.random=currNode.random.next;
            currNode=currNode.next.next;
        }
        //delete all those
        RandomListNode copy= head.next;
        RandomListNode scopy=copy;
        currNode=head;
       
        while(copy.next !=null){
        	
        	copy.next=copy.next.next;
        	copy=copy.next;
        }
        
        System.out.println("My Copy");
        while(scopy.next !=null){
            System.out.println(scopy.label);
            scopy=scopy.next;
        }
        return scopy;
    }
	
	
	public static void main(String[] args) {
		RandomListNode a= new RandomListNode(1);
		RandomListNode b= new RandomListNode(2);
		RandomListNode c= new RandomListNode(3);
		RandomListNode d= new RandomListNode(4);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null;
		
		a.random=a;
		b.random=a;
		c.random=a;
		d.random=a;
		copyRandomList(a);
				
	}

}
