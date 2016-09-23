package Question_1;

public class Traffic {
	 static String flag = "Green";
	
}

class Way1 extends Traffic implements Runnable{

	@Override
	public void run() {
				while(flag=="Green"){
								synchronized (this) {
									System.out.println("Green signal for way1>>>> "+"Way1 is Running");
												try {
													Thread.sleep(2000);
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
									
								}
								flag = "Red";
				}
				
				
				while(flag =="Red"){
								synchronized (this) {
									System.out.println("Red flag for Way2>>>> "+"Way2 is Stopped");
												try {
													Thread.sleep(1000);
													//Thread.yield();
												} catch (InterruptedException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												
								}
								flag = "Green";
				}
	}
	
	
}

class Way2 extends Traffic implements Runnable{

	@Override
	public void run() {
						while(flag=="Green"){
									synchronized (this) {
										System.out.println("Green signal for way2>>>> "+"Way2 is Running");
													try {
														Thread.sleep(2000);
													} catch (InterruptedException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
										
									}
									flag = "Red";
						}
						
						
						while(flag =="Red"){
									synchronized (this) {
										System.out.println("Red flag for Way1>>>> "+"Way1 is Stopped");
													try {
														Thread.sleep(1000);
													} catch (InterruptedException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
													
									}
									flag = "Green";
						}
		
	}
	
	
}

class TestTrafficSignal{
	public static void main(String[] args) {
		Way1 w1 = new Way1();
		Way2 w2 = new Way2();
		
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}
}