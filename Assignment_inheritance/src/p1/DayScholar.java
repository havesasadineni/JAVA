package p1;

public class DayScholar extends Student {
	public double transportFee;
	public DayScholar()
	{
	}
	public DayScholar(int studentId, String name, double examFee, double transportFee) 
	{
	        super(studentId,name,examFee);
	        this.transportFee = transportFee;
	}
	
  public void displayDetails()
  {   
	  System.out.println("====DAYSCHOLOR DETAILS====");
	  System.out.println("transportFee:"+transportFee); 
	  System.out.println("Name:"+name);
	  System.out.println("studentId:"+studentId);
	  System.out.println("examFee:"+examFee);
	  
  }
  public void payFee(double amount)
	{
		double totalFee=transportFee + examFee;
		System.out.println("remaining Fee:"+(totalFee-amount));
	}
}
