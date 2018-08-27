package notebook;
import java.util.*;
public class windowSliding {

	public static void main(String[] args) {
	int a[]= {9,6,11,8,10,5,13,93,14};
	Deque<Integer>q= new LinkedList<Integer>();
	int n=a.length;
	int k=4;
	int ri=0;
	int r[]= new int[n-k+1];
	for(int i=0;i<a.length;++i) {
		
		while(!q.isEmpty()&&q.peek()<i-k+1)
			q.poll();
		while(!q.isEmpty()&&a[q.peekLast()]<a[i])
			q.pollLast();
		q.offer(i);	
		if(i>=k-1) {
			r[ri++]=a[q.peek()];
		}
	}
	for(int i:r) {
		System.out.println(i);
	}
	
	}

}
