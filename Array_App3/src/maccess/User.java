package maccess;

public class User {
	public String mailId,name;
	public User(String name,String mailId)
	{
		this.name=name;
		this.mailId=mailId;
	}
	public String toString()
	{
		return name+"\t"+mailId;
	}

}
