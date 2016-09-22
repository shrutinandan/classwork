class ObjectCreation
{
	private static int count;
    private int number;
	public ObjectCreation(int num) {
		number = num;
	    count++;
	}

	public static void getCount() {
		System.out.println(count);
	}
}

public class CountObj {
	public static void main(String[] args) {
		ObjectCreation o1 = new ObjectCreation(1);
		ObjectCreation o2 = new ObjectCreation(2);
		ObjectCreation o3= new ObjectCreation(3);
		ObjectCreation.getCount();
		
		
	}

}
