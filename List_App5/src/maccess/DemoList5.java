package maccess;
import java.util.*;

public class DemoList5{

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Vector<Integer> ob=new Vector<Integer>();
		System.out.println("defaultcapacity:"+ob.capacity());
		System.out.println("Size:"+ob.size());
		int k=1;
		while(ob.size()<11)
		{
			int count=0;
			for(int i=1;i<=k;i++)
			{
				if(k%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				ob.addElement(new Integer(k));
			}
			k++;
		}
		System.out.println("=====Vector<E>=====");
		System.out.println(ob.toString());
		System.out.println("capacity:"+ob.capacity());
		System.out.println("Size:"+ob.size());
		System.out.println("====Enumeration<E>=====");
		Enumeration<Integer> e = ob.elements();
		while(e.hasMoreElements()) {
		Integer el = (Integer)e.nextElement();
		System.out.print(el+" ");
		}//end of loop
		System.out.println("\n====Iterator<E>-	asIterator()====");
		Enumeration<Integer> e2 = ob.elements();
		Iterator<Integer> it = e2.asIterator();
		it.forEachRemaining((z)->
		{
		System.out.print(z+" ");
		});
		


		

	}

}
