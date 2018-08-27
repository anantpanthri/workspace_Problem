import java.util.*;

public class slidingWindow {

	public static void main(String[] args) {
		int a[]= {1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k=4;
		int n=a.length; 
		int [] ri= new int[n-k+1]; 
		int r=0;
		Deque<Integer>q= new LinkedList<Integer>();
		int ll=1;
		for(int i=0;i<n;++i) {
			System.out.println("i current-->"+i);
			while(!q.isEmpty()&&q.peek()<i-k+1) {
				q.poll();
				System.out.println("1st "+ll++);
			}
			while(!q.isEmpty()&&a[q.peekLast()]<a[i]) {
				q.pollLast();
				System.out.println("2nd "+ll++);
			}
			q.offer(i);
			if(i>=k-1) {
				ri[r++]=a[q.peek()];
				//System.out.println(ll++);
			}
		}
		int sum=0;
		for(int i:ri) {
			sum+=i;
			System.out.print(i+",");
		}
		
		System.out.println();
		System.out.println(sum);

		

	}

}
