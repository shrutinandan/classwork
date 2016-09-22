class Fruit
{
	String name;
	int quantity;
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("Fruit [name=%s, quantity=%s]", name, quantity);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
public class Program {
	public static void main(String[] args) {
		
	Program p = new Program();
	try
	{
		p.accessElements();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception is :"+e);
	}
}


public void accessElements() throws ArrayIndexOutOfBoundsException
{
	Fruit arr[]= new Fruit[4];	
	//System.out.println(arr[0].getName());
	//System.out.println(arr[1].getName());
	Fruit f1=new Fruit("mango", 5);
	Fruit f2=new Fruit("mango", 6);
	Fruit f3=new Fruit("mango", 7);
	Fruit f4=new Fruit("mango", 8);
	Fruit f5=new Fruit("mango", 9);
	arr[0]=f1;
	arr[1]=f2;
	arr[2]=f3;
	arr[3]=f4;
	arr[4]=f5;
	//System.out.println(arr[4].getName());

}
	
	}