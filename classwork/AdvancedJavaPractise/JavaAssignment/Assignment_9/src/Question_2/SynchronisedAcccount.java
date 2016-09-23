package Question_2;

public class SynchronisedAcccount implements Runnable {

	Account acc = new Account();
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makewithdrawal(10);
			if (acc.getBalance()<0) {
				System.out.println("Balance is null Cannot withdraw");
			}
		}
		
	}
	
	public synchronized void makewithdrawal(int amnt) {
		if(acc.getBalance() >= amnt ){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(amnt);
			System.out.println(Thread.currentThread().getName()+" completes the withdrawal ");
			
		}
		else{
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acc.getBalance()); 
		}
		
	}

}
