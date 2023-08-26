package maccess;
import java.util.*;

public class DemoArray1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		try(s;)
		{try {
			System.out.println("enter the no of elements:");
			int n =s.nextInt();
			Integer a[]= new Integer[n];
			System.out.println("enter "+n+" Integer elements");
			int i;
			for(i=0;i<a.length;i++)
			{
				a[i]= new Integer(s.nextInt());
			}
			System.out.println("displaying the array");
			for(i=0;i<a.length;i++)
			{
				System.out.println(i+":"+a[i].toString());
			}
			System.out.println("\n====Display using Extended-for(Java5)====");
			for(Integer k : a)
			   {
				System.out.print(k.toString()+" ");
			   }//end of loop
			System.out.println("\n====Display usingSpliterator<T>(Java8)====");
			  Spliterator<Integer> sp =Arrays.spliterator(a);
				sp.forEachRemaining((k)->
				{
				 System.out.print(k.toString()+" ");
				}
				);
			
	}
		catch(Exception e) {e.printStackTrace();
	}}

}}
