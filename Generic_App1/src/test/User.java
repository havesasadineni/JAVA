package test;

public class User {
	public String uname, email;
	public User(String uname,String email)
	{
		this.uname=uname;
		this.email=email;
		
	}
	public String getUser()
	{
		return uname+"\t"+email;
	}

}
