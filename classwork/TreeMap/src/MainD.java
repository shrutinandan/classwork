import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable
{
	private int RollNo;
	private String name;
	private int percentage;
	public Student(int rollNo, String name, int perc) {
		RollNo = rollNo;
		this.name = name;
		this.percentage = perc;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return String.format("Student [RollNo=%s, name=%s, percentage=%s]",
				RollNo, name, percentage);
	}
	@Override
	public int compareTo(Object o) 
	{
		Student other = (Student)o;
		if(this.getPercentage()>other.getPercentage())
			return 1;
		else if(this.getPercentage()<other.getPercentage())
			return -1;
		else
			return 0;
	}
	
}
public class MainD {
public static void main(String[] args) {
	/*TreeMap<Integer, Student> stu=new TreeMap<Integer, Student>();
	stu.put(101,new Student(1, "shruti", 90));
	stu.put(102,new Student(2, "saurabh", 98));
	stu.put(103,new Student(3, "sfaf", 80));
	stu.put(104,new Student(4, "sdhnjdj", 850));
	for (Map.Entry m :  stu.entrySet()) 
	{
		int key1=(int) m.getKey();
		//System.out.println(key1+"   "+m.getValue());
		int key_to_remove= Integer.parseInt(args[0]);
		if(key1==key_to_remove)
		{
			stu.remove(key1);
			break;
		}
	}*/
	List<Student> stulist= new ArrayList<Student>();
	stulist.add(new Student(1, "shruti", 90));
	stulist.add(new Student(2, "saurabh", 98));
	stulist.add(new Student(3, "sfaf", 80));
	stulist.add(new Student(4, "sdhnjdj", 85));
	Collections.sort(stulist);
	for (Student s : stulist) 
	{
		System.out.println(s);
	}
	
	
	/*for (Map.Entry m :  stu.entrySet()) 
	{
		System.out.println(m.getKey()+"   "+m.getValue());
	}*/
  }
}
