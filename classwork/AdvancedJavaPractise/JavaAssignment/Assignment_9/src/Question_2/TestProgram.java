package Question_2;

public class TestProgram {

	public static void main(String[] args) {
		SynchronisedAcccount s = new SynchronisedAcccount();
		Thread one = new Thread(s);
		Thread two = new Thread(s);
		one.setName("Rishabh");
		two.setName("Samiksha");
		one.start();
		two.start();
	}

}
