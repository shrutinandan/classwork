interface Printable
{
public void print();
}
interface abc
{
	public void show();
	
}

interface wer extends Printable,abc
{
	public void capsicum();
}

class Company implements Printable
{
   String documents = "This is for printing employee's document";
   
	@Override
	public void print() {
		System.out.println(documents);
		
	}
	
}


class Student implements Printable
{
	String details = "This is for printing students's details";

	@Override
	public void print() {
		
		System.out.println(details);
	}
}

public class Program {
	public static void main(String[] args) {
		Printable stu= new Student();
		stu.print();
		Printable cmp= new Company();
		cmp.print();
	}

}
