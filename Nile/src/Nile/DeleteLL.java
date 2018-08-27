package Nile;

public class DeleteLL {

	public static void main(String[] args) {
		Node ll= new Node();
		ll=ll.populateLinkList();
		while(ll!=null) {
			System.out.println(ll.val);
			ll=ll.next;
		}
		ll=ll.populateLinkList();
		ll=deleteNode(ll,3);
		System.out.println("After modification"); 
		while(ll!=null) {
			System.out.println(ll.val);
			ll=ll.next;
		}
	}
	public static Node deleteNode(Node ll,int t) {
		Node fakeHead= new Node();
		fakeHead.next=ll;
		Node curr=ll,prev=fakeHead;
		while(curr!=null) {
			if(curr.val==t) {
				prev.next=curr.next;
			}
			else {
				prev=prev.next;
			}
			curr=curr.next;
		}
		return fakeHead.next;
		
	}

}
