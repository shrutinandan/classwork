class Table
{

	public synchronized void printTable(int num)
	{
		
			for(int i=1;i<11;i++)
			{
				System.out.println(""+num+"*"+i+"="+num*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}


class Thread1 extends Thread
{
	Table t;

	public Thread1(Table t) {
		
		this.t = t;
	}
	 public void run()
	 {
		
		 t.printTable(5);
	 }
}

class Thread2 extends Thread
{
	Table t;

	public Thread2(Table t) {
		
		this.t = t;
		
	}
	 public void run()
	 {
		
		 t.printTable(7);
	 }
	 
}

public class ThreadMain {
	public static void main(String[] args) {
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		t1.start();
		t2.start();
	}
	

}
