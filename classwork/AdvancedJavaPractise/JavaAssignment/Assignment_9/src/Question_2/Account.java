package Question_2;

public class Account {
	
	int balance = 50;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amnt) {
		balance = balance-amnt;
	}
	
	
}
