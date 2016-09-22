package cybage.com;

import java.util.Arrays;


class Fruit implements Cloneable //class fruit is created
{
	private String name;
	private String taste;
	
	
	
	public Fruit(String name, String taste) {
	
		this.name = name;
		this.taste = taste;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public String toString() {
		return String.format("Fruit [name=%s, taste=%s]", name, taste);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		this.name=name;
		this.taste=taste;
		return super.clone();
	}
	
	
}

public class FruitDemo 
{
	 static int top;
	 static int bottom;
	 private Fruit arr[]= new Fruit[10];
	 
      public static void main(String[] args) 
       {
         	FruitDemo fd1 = new FruitDemo(); //
         	Fruit f1 = new Fruit("mango","sweet");
         	Fruit f2 = new Fruit("banana","sweet");
         	Fruit f3 = new Fruit("grape","sour");
         	fd1.addFruit(f1);
         	fd1.addFruit(f2);
         	fd1.addFruit(f3);
         	
         	fd1.displayFruit();
         	fd1.popFruit();
         	fd1.displayFruit();
         	fd1.displayFruit();
         	try {
				Fruit f4 = (Fruit) f2.clone();
				fd1.addFruit(f4);
				fd1.displayFruit();
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
         	
	   }
      public void addFruit(Fruit f)
      {
    	  if(top<10)
    	  {
    		 
    		 arr[top++]= f;
    		 
    	  }
      }
      
      
      public void popFruit()
      {
    	if(bottom>-1)
    	{//arr[top-1].toString();
    	    //System.out.println(arr[top-1].getName());
    		System.out.println(arr[top-1]);
    		top--;
    	}	
      }
      
      public void displayFruit()
      {
    	if(bottom>-1)
    	{//arr[top-1].toString();
    	  //System.out.println(arr[top-1].getName());
    		System.out.println(arr[top-1]);
    		
    	}	
      }

}
