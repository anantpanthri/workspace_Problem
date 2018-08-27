package multithreading;

public class JoinTest {
	 int c=0;
	public synchronized void  doWork() {
	Thread t1= new Thread(new Runnable() {
		public void run() {
			for(int i=0;i<10000000;++i) {
				c++;
			}
		}
	});
	
	Thread t2= new Thread(new Runnable() {
		public void run() {
			for(int i=0;i<10000000;++i) {
				c++;
			}
		}
	});
	t1.start();
	t2.start();
	try {
		t1.join();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		t2.join();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(c);
	}
	public static void main(String args[]) {
		JoinTest t= new JoinTest();
		t.doWork();
	}
}
