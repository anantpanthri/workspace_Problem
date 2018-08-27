import java.util.*;
public class priorityQueueTest {

	public static void main(String[] args) {
		priority();
		functions();

		
	}
	private static void functions() {
		LinkedList<Integer> ls = new LinkedList<>();
		ls.addFirst(1);
		ls.addFirst(2);
		ls.addFirst(3);
		ls.addLast(9);
		ls.add(12);
		for(int i:ls) {
			System.out.print(i+"-->");
		}
		
		
	}




	private static void priority() {
		int arr[]= {1,2,3,4,5,6,7};
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator() {
			@Override
			public int compare(Object i, Object j) {
				if((Integer)i>(Integer)j)
					return -1;
				else if(i==j)
					return 0;
					return 1;
			}
		});
		
		
		
		for(int i:arr) {
			pq.add(i);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+",");
		}

	
	}

	
	
}
