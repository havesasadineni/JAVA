package p2;
import p1.*;
import java.util.*;


public class DemoInheritance8 {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a = s.nextInt();
	System.out.println("Enter the value of b:");
	int b = s.nextInt();

	System.out.println("Enter the value of b:");
	int c = s.nextInt();
	
	CClass ob = new CClass();
	ob.access(a, b, c);
	s.close();
			
	}
}
