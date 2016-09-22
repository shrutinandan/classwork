class Player                          //class player is created
{
	String name;
	int age;
    final String city = "Pune";
    int pay=5000;
	
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void playgame()
	{
		System.out.println("He Playes");
	}
	@Override
	public String toString() {
		return String.format("Player [name=%s, age=%s, city=%s]", name, age,
				city);
	}	
}

class FootballPlayer extends Player                       //class   
{
	int goals;


	public FootballPlayer(String name,int age,int goals) {
		
		super(name,age);
		
		this.goals=goals;
		
	}



	public void playgame()
	{
		System.out.println("He Playes Football from:"+city);
	}

    public void getTotalPay()
    {
    	
    }

	@Override
	public String toString() {
		return String.format("FootballPlayer name=%s,age=%d,[goals=%s]",name,age, goals);
	}
	
	
	
}
class CricketPlayer extends Player
{
	int score;
	
	
	
	public CricketPlayer(String name, int age,int score) {
		super(name, age);
		this.score=score;
	}



	public void playgame()
	{
		System.out.println("He Playes Cricket from:"+city);
	}



	@Override
	public String toString() {
		return String.format("CricketPlayer name=%s,age=%d, [score=%s]", name,age,score);
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		FootballPlayer o1= new FootballPlayer("saurabh",23,5);
		CricketPlayer o2=new CricketPlayer("Shruti",23,100);
		///o1.playgame();
		//o2.playgame();
		System.out.println(o1);
		System.out.println(o2);
		
	}
}
