package revisE;

public class reverseLinkList {

	public static void main(String[] args) {
		ListNode a= new ListNode();
		a=a.populateLinkList();
		a.printlist(a);
		
		/*
		 * sublist reverse
		 * count the link list length
		 * find the kth element to reverse
		 * then put it in an array
		 * reverse the array using pointers at first and last nodes
		 * overwrite the array data to link list 
		 * space complexity due to array and not in a single pass
		 */
		
		/*
		 * for a single pass we know the first and last element position
		 */
		System.out.println("The list begins reversal");
		ListNode b=null;
		while (a!=null) {
			ListNode tmp=a.next;
			a.next=b;
			b=a;
			a=tmp;
		}
		b.printlist(b);


	}

}
