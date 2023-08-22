package p1;

public class Student {
	public int studentId;
	public String name;
	public double examFee;
	
	public  Student()
	{
	}
	public Student(int studentId,String name,double examFee)
	{
	   this.studentId=studentId;
	   this.name =name;
	   this.examFee=examFee;
	}
	
	
	public void  displayDetails()
	{
		System.out.println("====STUDENT DETAILS====");
		System.out.println("Student Name:"+name);
		System.out.println("Student ID:"+studentId);
		System.out.println("Student examFee:"+examFee);
	}
	public void payFee(double amount)
	{
		double totalFee=examFee;
		System.out.println("remaining Fee:"+(totalFee-amount));
	}
	

}
