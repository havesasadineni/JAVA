package p1;
import java.util.Scanner;
public class AddUserDetails {
public	UserDetails us=null;
public AddUserDetails(UserDetails us)
{this .us=us;
}
	public void addDetails(Scanner s)
	{
		System.out.println("Enter the uName:");
		us.uName = s.nextLine();
		System.out.println("Enter the PASSWORD:");
		us.pWord = s.nextLine();
		System.out.println("Enter the FNAME:");
		us.fName = s.nextLine();
		System.out.println("Enter the LNAME:");
		us.lName = s.nextLine();
		System.out.println("Enter the MAIL ID:");
		us.ct.mId = s.nextLine();
		System.out.println("Enter the Phone no:");
		us.ct.phNo = Long.parseLong(s.nextLine());;
		System.out.println("Enter the house number:");
		us.ad.hNo = s.nextLine();
		System.out.println("Enter the street Name:");
		us.ad.sName = s.nextLine();
		System.out.println("Enter the city:");
		us.ad.city = s.nextLine();
		System.out.println("Enter the state");
		us.ad.state = s.nextLine();
		System.out.println("Enter the pinCde");
		us.ad.pinCode = s.nextInt();
		
		
		
	}
	

}
