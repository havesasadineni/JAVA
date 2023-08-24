package p2;
import p1.*;
import java.util.Scanner;

public class DemoRef4 {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	UserDetails ob1=new UserDetails();
	AddUserDetails ob2=new AddUserDetails(ob1);
	DisplayUserDetails ob3 =new DisplayUserDetails(ob1);
	ob2.addDetails(s);
	ob3.DisplayDetails();
	s.close();
	
	
	}

}
