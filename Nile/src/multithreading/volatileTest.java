package multithreading;

public class volatileTest extends Thread{
private  boolean flag;
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
		volatileTest t1= new volatileTest();
		t1.setName("T1");
		volatileTest t2= new volatileTest();
		t1.flag=true;
		t2.setName("T2");
		t2.flag=true;
		t1.start();t2.start();
	//	t1.flag=false;
	//	t2.flag=false;
		
		


	}

}
