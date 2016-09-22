class Authentication
{
	String name;
	String password;
	int pin;
	
	public void login(String name)
	{
		System.out.println("hello "+ name+"(no security)");
	}
	public void login(String name,String password)
	{
		System.out.println("hello "+ name +" your password is :" +password+"(medium security)" );
	}
	public void login(String name,String password,int pin)
	{
		System.out.println("hello "+ name +" your password is :" +password +" with pin :" + pin+"(heigh security)");
	}
}
public class Program {
public static void main(String[] args) {
	Authentication a1= new Authentication();
	a1.login("shruti");
	a1.login("shruti","shr");
	a1.login("saurabh", "sg", 1234);
}
}
