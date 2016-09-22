package com.cybage;
class Employee
{
	private String name;
	private int emp_id;
	private int age;

	
	
	public Employee(String name, int emp_id, int age) {
		this.name = name;
		this.emp_id = emp_id;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + age;
		result = prime * result + emp_id;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if (this == obj)
			 flag=true;
		if (obj == null)
			return flag;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		/*if (age != other.age)
			return false;
		if (emp_id != other.emp_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;*/
		if(this.emp_id==other.emp_id)
			flag=true;
		return flag;
	}
	@Override
	public String toString() {
		return String.format(
				"Employee [name=%s, emp_id=%s, age=%s, extension=%s]", name,
				emp_id, age);
	}
	
}
public class MainDemo {
public static void main(String[] args) {

		Employee emp1=new Employee("shruti", 16720, 23);
		Employee emp2=new Employee("shruti", 16720, 23);
		Employee emp3=new Employee("shruti", 16720, 18);
		
		
		
		System.out.println(emp1.equals(emp1));
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));

	}

}
