package cybage.com;
class Date                                                     //date class is there
{
	private int dd;
	private int mm;
	private int yy;
	private String date;
	
	public void setDate(int d,int m,int y)                    //setting date
	{
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	
	public void displayDate()                                  //method for displaying date
	{
		System.out.println(""+dd+" "+mm+" "+yy);
	}
	
	
}

public class Date_New {
	public static void main(String[] args) {
		Date d1 = new Date();                       //creating object for class date
		d1.setDate(1,1,2016);                      //calling setter method
		Date d2=new Date();                        //creating object for class date
		d2.setDate(2,2,2016);                        //calling setter method
		d1.displayDate();                             //calling display method
		d2.displayDate();                              //calling display method
	}



}
