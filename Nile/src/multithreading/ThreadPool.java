package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
	private int id;
	public Processor(int id) {
		this.id=id;
	}
	@Override
	public void run() {

		System.out.println("Thread with id "+id+" started ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread with id "+id+" completed ");
		

	}

}
public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor= Executors.newFixedThreadPool(2);
		for(int i=0;i<500;++i) {
			executor.submit(new Processor(i));
		}
		executor.shutdown();
		System.out.println("All tasks completed");
		try {
			executor.awaitTermination(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
