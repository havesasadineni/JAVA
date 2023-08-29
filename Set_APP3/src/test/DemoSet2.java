package test;
import java.util.*;
public class DemoSet2 {

	@SuppressWarnings("removal")
	public static void main(String[] args)
	{Scanner s = new Scanner(System.in);
		try(s;)
		{try {
			
		
			LinkedHashSet<Integer> ob = new LinkedHashSet<Integer>();
			System.out.println("ENter number of elements to add to set");
			int n = s.nextInt();
			for(int i =1;i<=n;i++)
			{
				ob.add(new Integer(s.nextInt()));
			}
			System.out.println("====Set-Elements====");
			System.out.println(ob.toString());
			Iterator<Integer> it=ob.iterator();
			while(it.hasNext())
			{
				Integer ele=it.next();
				int count=0;
				for(int i=0;i<=ele;i++)
				{
					if(ele%1==0)
					{
						count++;
					}
				
				}
				if(count!=2)
				{
					it.remove();
				}
			}
			System.out.println("\n====Set-Elements====");
					System.out.println(ob.toString());
					System.out.println("Size of Set :"+ob.size());
			
		}catch(Exception e) {e.printStackTrace();}
		
	}}

}
