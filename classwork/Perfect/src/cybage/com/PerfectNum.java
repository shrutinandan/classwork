package cybage.com;

public class PerfectNum {
	public static void main(String[] args) {
		int counter=2,k,i,sum=1;
		k=Integer.parseInt(args[0]);
		while(counter<k)
		{
			if(k%counter==0)
			{
				sum=sum+counter;
			}
			counter++;
		}
		System.out.println(sum);
		if(sum==k)
		{
		System.out.println("Perfect Num");
	
		}
		else
		{
			System.out.println(" not Perfect Num");
		}
			
	}

}
