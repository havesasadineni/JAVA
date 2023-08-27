package test;
import java.util.*;


public class DemoArray4 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			
				Integer a[][]=new Integer[3][3];
				System.out.println("===enter 3x3 matrix===");
				for(int i =0;i<=2;i++)
				{
					for(int j =0;j<=2;j++)
					{   
						a[i][j]=s.nextInt();
					}
				}
				System.out.println("===display 3x3 matrix===");
				for(int i =0;i<=2;i++)
				{
					for(int j =0;j<=2;j++)
					{   
					 System.out.println(a[i][j].toString()+" ");
					}
					System.out.println();
				}
				System.out.println("===Display Using Extended for===");
						for(Integer p[] : a)
						{
						for(Integer k : p)
						{
						System.out.print(k.toString()+" ");
						}//InnerLoop
						System.out.println();
						}//end of OuterLoop
						System.out.println("====Display Using Spliterator&lt;T>===");
						Spliterator<Integer[]> sp1 =Arrays.spliterator(a);
						sp1.forEachRemaining((p)->
						{
						Spliterator<Integer> sp2 = Arrays.spliterator(p);
						sp2.forEachRemaining((q)->
						{
						System.out.print(q.toString()+" ");
						});
						System.out.println();
						});
				
				
			
		}
		
		
				
		
		
	}
}
				
