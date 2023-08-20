package maccess;


public class DBCon9 {
	public static void main(String[] args)
	{
		String s2 ="java" ;
		String s1 ="java" ;
		String s3 =new String("ava") ;
		String s4 =new String("ava") ;
		System.out.println("====direct string declaration====");
		if(s1==s2)
	
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		
		System.out.println("====with new====");
		if(s3==s4)
	
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		
	}
	

}
