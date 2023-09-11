package maccess;
import java.util.*;

public class DemoDequeue {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
				for(int i=21;i<=25;i++)
				{
				ad.add(new Integer(i));
				}//end of loop
				System.out.println(ad.toString());
				ad.addFirst(new Integer(500));
				ad.addLast(new Integer(700));
				System.out.println(ad.toString());
				ad.offerFirst(new Integer(700));
				ad.offerLast(new Integer(500));
				System.out.println(ad.toString());
				ad.removeFirstOccurrence(new Integer(500));
				System.out.println(ad.toString());
				ad.removeLastOccurrence(new Integer(700));
				System.out.println(ad.toString());
		

	}

}
