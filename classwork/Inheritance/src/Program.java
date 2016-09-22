class Address                                                //class address is created
{
	int house_no;
	int street_no;
	String city;
	
	public  Address(int house_no, int street_no, String city) {
		
		this.house_no = house_no;
		this.street_no = street_no;
		this.city = city;
	}

	public int getHouse_no() {
		return house_no;
	}

	public void setHouse_no(int house_no) {
		this.house_no = house_no;
	}

	public int getStreet_no() {
		return street_no;
	}

	public void setStreet_no(int street_no) {
		this.street_no = street_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Address [house_no=%s, street_no=%s, city=%s]",
				house_no, street_no, city);
	}
	
	
	
	
}
class Employee         // class Employee start here
{
	int emp_id;
	String name;
	Address add;                         //composition
	public Employee(int emp_id, String name,int house_no, int street_no, String city) 
	{
		
		this.emp_id = emp_id;
		this.name = name;
		this.add = new Address(house_no,street_no,city);
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return String.format("Employee [emp_id=%s, name=%s, add=%s]", emp_id,
				name, add);
	}
	
	public void display()
	{
		System.out.println(this.emp_id);
	}

}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "saurabh", 123, 22, "pune");   
		System.out.println(emp1);
		//emp1.display();
	}

}
