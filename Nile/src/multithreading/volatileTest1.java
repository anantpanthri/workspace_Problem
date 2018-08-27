package multithreading;

public class volatileTest1 extends Thread{
private boolean flag;
	public void run() {
		
		while(flag) {
			System.out.println(Thread.currentThread()+" says Hello");
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	
	
	public static void main(String[] args) {
		volatileTest1 obj= new volatileTest1();
		obj.flag=true;
		Thread t1= new Thread(obj);
		t1.start();
		obj.flag=false;
		Thread t2= new Thread(obj);
		t2.start();

	}

}
