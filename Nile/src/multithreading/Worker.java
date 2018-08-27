package multithreading;
import java.util.*;
public class Worker {

	private List<Integer>ls1 = new ArrayList<>();
	private List<Integer>ls2 = new ArrayList<>();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	public  void stageOne() {
		synchronized(lock1) {
		try {
		Thread.sleep(1);
		}catch(Exception e) {
		e.printStackTrace(); 
		}
		ls1.add(new Random().nextInt(100));
		}
	}
	public void stageTwo() {
		synchronized(lock2) {
		try {
		Thread.sleep(1);
		}catch(Exception e) {
		e.printStackTrace(); 
		}
		ls2.add(new Random().nextInt(100));
		}
	}
	public void process() {
		for(int i=0;i<1000;++i) {
			stageOne();
			stageTwo();
		}
	}
	public void main() {
		System.out.println("Start..");
		long start=System.currentTimeMillis();
		Thread t1= new Thread(new Runnable() {
			public void run() {
				process();
			}
			
		});
		Thread t2= new Thread(new Runnable() {
			public void run() {
				process();
			}
		});
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		long end= System.currentTimeMillis();
		System.out.println("Time taken "+(end-start));
		System.out.println("list1 size: "+ls1.size()+" list2 size: "+ls2.size());
		
	}

}
