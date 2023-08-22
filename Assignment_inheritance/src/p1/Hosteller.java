package p1;

public class Hosteller extends Student {
	public double hostelFee;
	public Hosteller()
	{
	}
	public Hosteller(int studentId, String name, double examFee, double transportFee) 
	{
	        super(studentId,name,examFee);
	        this.hostelFee = transportFee;
	}
	
  public void displayDetails()
  {
	  System.out.println("====HOSTELLER DETAILS====");
	  System.out.println("hostelFee:"+hostelFee); 
	  System.out.println("Name:"+name);
	  System.out.println("studentId:"+studentId);
	  System.out.println("examFee:"+examFee);
	  
  }
  public void payFee(double amount)
	{
		double totalFee=examFee+hostelFee;
		System.out.println("remaining Fee:"+(totalFee-amount));
	}
}
