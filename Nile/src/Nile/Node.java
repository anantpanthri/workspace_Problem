package Nile;

public class Node {
	int val;
	Node next;
	Node(int x){
		val=x;
	}
	Node(){
	}
	public static Node populateLinkList(){
		Node a= new Node(3);
		Node b= new Node(2);
		Node c= new Node(3);
		Node d= new Node(4);
		Node e= new Node(3);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		return a;
	}
	
	public static Node palindromeLinkList(){
		Node a= new Node(1);
		Node b= new Node(2);
		Node c= new Node(3);
		Node f= new Node(3);
		Node d= new Node(2);
		Node e= new Node(1);
		
		a.next=b;
		b.next=c;
		c.next=f;
		f.next=d;
		d.next=e;
		return a;
	}
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.val+",");
			head=head.next;
		}
		System.out.println();
	}
}
