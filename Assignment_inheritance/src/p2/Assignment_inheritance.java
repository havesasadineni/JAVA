package p2;
import p1.*;
import java.util.*;

public class Assignment_inheritance {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		Student student = new Student(123, "John Smith", 100.0);
		student.displayDetails();
		System.out.println("enter amount you can pay:");
		double amt=s.nextInt();
		student.payFee(amt);
		
		 DayScholar dayScholar = new DayScholar(456, "Jane Doe", 150.0, 500.0);
		dayScholar.displayDetails();
		System.out.println("enter amount you can pay:");
		double amt2=s.nextInt();
		dayScholar.payFee(amt2);
		
		 Hosteller hosteller = new Hosteller(789, "Alice Johnson", 200.0, 1000.0);
		 hosteller.displayDetails();
		 System.out.println("enter amount you can pay:");
			double amt3=s.nextInt();
			hosteller.payFee(amt3);
			s.close();
	}

}
