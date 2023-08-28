package test;
import java.util.*;
public class DemoSet2 {

	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		try {
			LinkedHashSet<Integer> ob1 = new LinkedHashSet<Integer>();
			LinkedHashSet<Integer> ob2 = new LinkedHashSet<Integer>();
			LinkedHashSet<Integer> ob3 = new LinkedHashSet<Integer>();
			
			//Adding elements into ob1
			ob1.add(new Integer(11));
			ob1.add(new Integer(12));
			ob1.add(new Integer(13));
			ob1.add(new Integer(14));
			//Adding elements into ob2
			ob2.add(new Integer(21));
			ob2.add(new Integer(22));
			ob2.add(new Integer(23));
			ob2.add(new Integer(24));
			
			//Adding elements into ob3
			ob3.add(11);
			ob3.add(22);
			
			ob1.addAll(ob2);
			System.out.println("====Elements from ob1====");
			System.out.println(ob1.toString());
			ob1.removeAll(ob2);
			System.out.println("====Elements fromob1====");
			System.out.println(ob1.toString());
			boolean p = ob1.contains(new Integer(12));
			System.out.println("12 available in ob1 : "+p);
			boolean q = ob1.containsAll(ob3);
			System.out.println("ob2 available in ob1 :"+q);
			ob1.retainAll(ob3);
			System.out.println("====retainAll()====");
			System.out.println(ob1.toString());
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
