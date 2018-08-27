package multithreading;

public class Runner implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;++i) {
			System.out.println(Thread.currentThread()+"-->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		
		Thread t1= new Thread(new Runner());
		Thread t2= new Thread(new Runner());
		//t1.start();
		//t2.start();
		t1.run();
		t2.run();
	}

}
