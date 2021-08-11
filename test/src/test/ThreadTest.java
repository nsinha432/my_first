package test;

public class ThreadTest {
	public static void main(String[] args) {
		/*Thread t = Thread.currentThread();
		//System.out.println(t);
		t.setName("Nikhil's main");*/
		
		System.out.println(Thread.currentThread());
		
		MyThreadTest m1 = new MyThreadTest();
		m1.setName("My Thread 1");
		m1.setPriority(Thread.MAX_PRIORITY);
		
		MyThreadTest m2 = new MyThreadTest();
		m2.setName("My Thread 2");
		m2.setPriority(Thread.NORM_PRIORITY);
		
		MyThreadTest m3 = new MyThreadTest();
		m3.setName("My Thread 3");
		m3.setPriority(Thread.MIN_PRIORITY);
		
		MyThreadTest m4 = new MyThreadTest();
		m4.setName("My Thread 4");
		
		MyThreadTest m5 = new MyThreadTest();
		m5.setName("My Thread 5");
		
//		m1.setDaemon(true);
//		m2.setDaemon(true);
	//	m3.setDaemon(true);
		//m4.setDaemon(true);
		//m5.setDaemon(true);
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main ends here");
		
	}
}
