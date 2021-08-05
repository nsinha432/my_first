package test;

public class MyThreadTest extends Thread {
	
	@Override
	public void run() {
		//System.out.println("hello from thread : "+Thread.currentThread()+" Thread id : "+Thread.currentThread().getName());
		
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
		}
	}
	
}
