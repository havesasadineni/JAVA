package p2;
import p1.*;
import java.util.Scanner;

public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Employee e =new Employee();
		System.out.println("eId:");
		e.eId= s.nextLine();
		System.out.println("eName:");
		e.eName= s.nextLine();
		System.out.println("eDesg:");
		e.eDesg= s.nextLine();
		System.out.println("Enter the EmpHNo:");
		e.ad.hNo = s.nextLine();
		System.out.println("Enter the EmpSName:");
		e.ad.sName = s.nextLine();
		System.out.println("Enter the EmpCity:");
		e.ad.city = s.nextLine();
		System.out.println("Enter the EmpState:");
		e.ad.state = s.nextLine();
		System.out.println("Enter the EmpPinCode:");
		e.ad.pinCode = Integer.parseInt(s.nextLine());
		System.out.println("Enter the EmpMailId:");
		e.ct.mId = s.nextLine();
		System.out.println("Enter the EmpPhoneNo:");
		e.ct.phNo = s.nextLong();
		System.out.println("Enter the EmpbSal:");
		e.sl.bSal= s.nextLong();
		e.sl.totSal = (e.sl.bSal+(0.93F*e.sl.bSal)+(0.63F*e.sl.bSal));
		e.getEmployee();
		e.ad.getAddress();
		e.ct.getContact();
		e.sl.getSalary();
		s.close();
	}

}
