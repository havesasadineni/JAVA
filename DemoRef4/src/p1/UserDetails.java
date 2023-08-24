package p1;

public class UserDetails{
  public String uName,pWord,fName,lName;
  Address ad =new Address();
  Contact ct =new Contact();
  public void getUserDetails() {
		System.out.println("=====User Details=====");
		System.out.println("uName:"+uName);
		System.out.println("pWord:"+pWord);
		System.out.println("fName :"+fName);
		System.out.println("lName:"+lName);
		ad.getAddress();
		ct.getContact();
		
}}
