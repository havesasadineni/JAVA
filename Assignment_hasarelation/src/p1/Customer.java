package p1;

public class Customer {
	public  String firstName;
	public   String lastName;
	//Setter Methods
	public void setfirstName(String firstName)
	{
	this.firstName=firstName;
	}
	public void setlastName(String lastName)
	{
	this.lastName=lastName;
    }
	//getter methods
	public String getfirstName()
	{
	return firstName;
	}
	public String getlastName()
	{
	return lastName;
	}
	public Customer() {
	//default constructor
	}
	public Customer(String firstName,String lastName)
	{
	   this.firstName=firstName;
	   this.lastName=lastName;
	   System.out.println("Customer Name:"+firstName+ lastName);
	}
	
	

}
