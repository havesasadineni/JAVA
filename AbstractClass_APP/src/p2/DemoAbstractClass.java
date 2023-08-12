package p2;
import p1.*;
import java.util.*;
public class DemoAbstractClass {

	public static void main(String[] args) {
		
		//AClass ob = new AClass(12,13);//Error

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = s.nextInt();
		System.out.println("Enter the value of b:");
		int b = s.nextInt();
		EClass ob = new EClass(a,b);//EClass_Con_Call
		ob.getValues();
		ob.addValues();
		s.close();
	}

}
