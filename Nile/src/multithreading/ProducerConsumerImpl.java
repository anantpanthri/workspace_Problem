package multithreading;

public class ProducerConsumerImpl {
static Processors process= new Processors();
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				try {
					process.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				try {
					process.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();t2.start();
		try {
		t1.join();t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
