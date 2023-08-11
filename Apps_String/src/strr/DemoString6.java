package strr;
import java.util.*;

public class DemoString6 {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		try(s;)
		{
			System.out.println("enter a string:");
			String s1= s.nextLine();
			int count =0;
			for(int i=1;i<=(s1.length()-1);i++)
			{
				char ch = s1.charAt(i);
				if (ch == 'a'||ch=='A'||ch=='e'||ch=='E'
					||ch=='i'||ch=='i'||ch=='O'||ch=='o'
					||ch=='u'||ch=='u') {
				    System.out.println("vowel used it :"+ch);
					count++;
					
				}
				
				
			}
			System.out.println("the no of vowlels are:"+count);
			
		}
		
	}

}
