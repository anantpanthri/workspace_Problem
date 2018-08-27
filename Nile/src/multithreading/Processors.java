package multithreading;
import java.util.*;

public class Processors {
	private final int limit=10;
	LinkedList <Integer> ls= new LinkedList<Integer>();
	Object lock= new Object();
	public void producer() throws InterruptedException{
		int value=0;
		while(true) {
			synchronized(lock) {
				while(ls.size() == limit) {
					lock.wait();
				}
				ls.add(value++);
				lock.notify();
			}
		} 
	}
	public void consumer() throws InterruptedException{
		while(true) {
			synchronized(lock) {
				while(ls.size()==0) {
					lock.wait();
				}
				System.out.println("Size "+ls.size()+" removed "+ ls.removeFirst());
				lock.notify();
			}
			Thread.sleep(10);
		}
		
		
		
	}
}
