package LinkedList;
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}
	ListNode(){
	}
	public static ListNode populateLinkList(){
		ListNode a= new ListNode(1);
		ListNode b= new ListNode(2);
		ListNode c= new ListNode(3);
		ListNode d= new ListNode(4);
		ListNode e= new ListNode(5);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		return a;
	}
	
	public static ListNode palindromeLinkList(){
		ListNode a= new ListNode(0);
		ListNode b= new ListNode(0);
		ListNode c= new ListNode(3);
		ListNode d= new ListNode(2);
		ListNode e= new ListNode(1);
		
		a.next=b;
	//	b.next=c;
//		c.next=d;
//		d.next=e;
		return a;
	}
}
