package table1;

public class Tables {
	public static void main(String[] args) {
	
	int i=1;
	int n;
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	int k=Integer.parseInt(args[0]);
	for (int i1 : arr) {
	n=i1*k;	
	System.out.println( arr[i1]  +"*" + i + " = "+i1*i);
	i1++;
	}
	}
}
