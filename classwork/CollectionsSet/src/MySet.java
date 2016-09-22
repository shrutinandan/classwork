import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;




public class MySet {
	public static void main(String[] args) {
		/*Set set=new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add(new Integer(6));
		set.add(new Float(5.5F));
	    set.add("two");				//duplicates not allowed
	    set.add(new Integer(6));	//duplicates not allowed
		//System.out.println(set);
		//List <Integer> list=new ArrayList<Integer>();
	
		//list.add("one");
		//list.add("tsdgsg");
		//list.add("three");
		//list.add("two");				//duplicates not allowed
			//duplicates not allowed
		//System.out.println(list);*/
		
		
		
		
		List <Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(5);
		l1.add(3);
		l1.add(6);
		
		
		
		List <Integer> l2=new ArrayList<Integer>();
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(68);
		Iterator<Integer> itr = l2.iterator();
		while(itr.hasNext())
		{
			
			int temp = itr.next();
			
			if(!l1.contains(temp))
			l1.add(temp);
		}
		System.out.println(l1);
		
		
		
		
		
	}

}
