package LinkedList;

public class pallindrome {

	public static void main(String[] args) {

		ListNode head= (new ListNode()).palindromeLinkList();
		ListNode s=head;
		ListNode f=head;
		while(s!=null && f!=null &&  f.next!=null) {
			s=s.next;
			f=f.next.next;
		}
		if(f!=null)//odd
			s=s.next;
		//reverse S
		//compare till original and S until S is null if they click then good else false
		ListNode newhead=null;
		while(s!=null)
		{
			ListNode next=s.next;
			s.next=newhead;
			newhead=s;
			s=next;
		}
		while(newhead!=null) {
			if(head.val!=newhead.val)
				System.out.println("false");
			newhead=newhead.next;
			head=head.next;
		}

		System.out.println("true");
		
		
	}

}
