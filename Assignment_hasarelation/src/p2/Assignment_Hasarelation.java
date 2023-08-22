package p2;
import  p1.*;
import java.util.*;

public class Assignment_Hasarelation {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		Account ob =new Account();
		// setter and getter to take values
		System.out.println("enter firstname:");
		String fname =s.nextLine();
		System.out.println("enter lastname:");
		String lname =s.nextLine();
		ob.ob3.setfirstName(fname);
		ob.ob3.setlastName(lname);
		String firstName = ob.ob3.getfirstName();
		String lastName	= ob.ob3.getlastName();	
		// by new we can call constructor
		new Customer(firstName,lastName);
		
		System.out.println("amount to deposit:");
		double dep =s.nextInt();
		ob.deposit( dep);
		
		System.out.println("amount to withdraw:");
		double withd =s.nextInt();
		
		ob.withdraw(withd);
		
		ob.Display();
		
		
		
		
		
		
		s.close();
	}

}
