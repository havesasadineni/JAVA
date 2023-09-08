package maccess;
import java.util.*;

public class DemoList1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=11;i<=15;i++)
		{
			a1.add(new Integer(i));
			
		}
		System.out.println(a1.toString());
		a1.add(2,new Integer(500));
		System.out.println(a1.toString());
		a1.add(2,new Integer(700));
		System.out.println(a1.toString());
		Integer e1=a1.get(3);
		System.out.println("ele at index 3:"+e1);
		a1.add(new Integer(12));
		System.out.println(a1.toString());
		int i1 = a1.indexOf(new Integer(12));
		int i2 = a1.lastIndexOf(new Integer(12));
		System.out.println("First index of 12 : "+i1);
		System.out.println("Last index of 12 : "+i2);
		List<Integer> ls = a1.subList(1, 4);
		System.out.println("sublist from 1-3:"+ls.toString());
		System.out.println("***ListIterator<E>-listIterator()***");
		ListIterator<Integer> ob1 = a1.listIterator();
		System.out.print("Forward : ");
		while(ob1.hasNext()) {
		Integer ele = ob1.next();

		System.out.print(ele+" ");
		}//end of loop
		System.out.print("\nBackward : ");
		while(ob1.hasPrevious()) {
		Integer ele2 = ob1.previous();
		System.out.print(ele2+" ");
		}//end of loop
		System.out.println("\n***ListIterator<E>-listIterator(index)***");
		ListIterator<Integer> ob2 = a1.listIterator(3);
		System.out.print("Forward : ");
		while(ob2.hasNext()) {
		Integer ele3 = ob2.next();
		System.out.print(ele3+" ");
		}//end of loop
		System.out.print("\nBackward : ");
		while(ob2.hasPrevious()) {
		Integer ele4 = ob2.previous();
		System.out.print(ele4+" ");
		}//end of loop


		

	}

}
