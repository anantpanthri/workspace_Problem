package LinkedList;

import java.util.*;

//In place reversal both iterative and recursive
public class ReverseLL {

	public static void main(String[] args) {
//This line can be used to populate the link list 
	//iterativeApproach();
		ListNode head= ListNode.populateLinkList();
	//	head=recursiveapproach(head,null);
		
		head=stackApproach(head);
	
		while(head!=null)
			{
				System.out.println(head.val);
				head=head.next;
			}
	}
	//	stack approach
	private static ListNode stackApproach(ListNode head) {
		Stack<ListNode> st= new Stack<>();
		while(head!=null)
		{
			st.push(head);
			head=head.next;
		}
		
		ListNode fk=st.pop();
		ListNode fk2=fk;
		while(!st.isEmpty())
		{
			ListNode tmp=st.pop();
			fk.next=tmp;
			fk=tmp;
		}
		fk.next=null;
		
		return fk2;
	}

	private static ListNode recursiveapproach(ListNode head, ListNode newHead) {
		if(head==null)
		return newHead;
		ListNode next=head.next;
		head.next=newHead;
		return recursiveapproach(next,head);
	}

	private static void iterativeApproach() {
		ListNode head= ListNode.populateLinkList();
		//two additional pointers
		ListNode tempHead=null;
		while(head!=null) {
			ListNode next = head.next;
			head.next=tempHead;
			tempHead=head;
			head=next;
		}
		while(tempHead!=null)
		{
			System.out.println(tempHead.val);
			tempHead=tempHead.next;
		}
	}
}