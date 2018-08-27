package multithreading;

public class Runner1 extends Thread {

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
	
	public static void main(String[] args) {
		
		Runner1 t1= new Runner1();
		Runner1 t2= new Runner1();

		t1.start();
		t2.start();

	}

}
