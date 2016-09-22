package com.cybage;

class HorrorHouse
{
	private String name;
	private int age;
	public HorrorHouse(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


class LowAge extends Exception
{
   LowAge(String name)
   {
	   System.out.println(name);
   }
}

public class MainDemo {
	public static void main(String[] args) {
		
		HorrorHouse h1 =new HorrorHouse("shruti", 16);
		try
		{
		if(h1.getAge()<18)
		{
			throw new LowAge("you are too small");
		}
		else
		{
			System.out.println("thaNK U ");
		}
		}
		catch(LowAge e)
		{
			System.out.println("See you in future");
		}
	}

}
