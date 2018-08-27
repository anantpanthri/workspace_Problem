package walmart;

public class ReverseLL {

	public static void main(String[] args) {
		Node a=new Node(1);
		Node b= new Node (2);
		Node c= new Node (3);
		Node d= new Node(4);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null;
		
		Node temp=reverseLL(a,null);
		while(temp!=null) {
			System.out.print(temp.val+",");
			temp=temp.next;
		}
	}
	private static Node reverseLL(Node head, Node newHead) {
		if(head==null)return newHead;
		Node next= head.next;
		head.next=newHead;
		return reverseLL(next,head);
	}

}
