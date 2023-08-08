package p1;

public class Employee {
	public String eId,eName,eDesg;
	public Address ad= new Address();
	public Contact ct =new Contact();
	public Salary  sl = new Salary();
	public void getEmployee()
	{   
		System.out.println("=====Employee Details=====");
		System.out.println("eId"+eId);
		System.out.println("eName"+eName);
		System.out.println("eDesg"+eDesg);
	
	}

}
