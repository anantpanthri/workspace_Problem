package multithreading;
import java.util.concurrent.*;
import java.util.*;
public class ProducerConsumerUsingQueue {

	private static BlockingQueue<Integer>queue=new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2= new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}catch(Exception e) {
			
		}
		
	}
	private static void producer() throws InterruptedException {
		while(true) {
			queue.put((new Random()).nextInt(100));
		}
	}
	private static void consumer() throws InterruptedException {
		
		while(true) {
			Thread.sleep(100);
			if((new Random ()).nextInt(10)==0) {
				int pol=queue.take();
				System.out.println("The value "+pol+" size is "+queue.size());
			}
		}
	}

}
