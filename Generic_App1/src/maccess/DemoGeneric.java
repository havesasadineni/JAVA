package maccess;
import test.*;

public class DemoGeneric {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Display <Integer> d1 = new Display<Integer>();
		Display <String> d2 = new Display<String>();
		Display <User> d3 = new Display<User>();
		
		d1.setref(new Integer(12));
		d2.setref(new String("hello"));
		d3.setref(new User("Alex","A@gmail.com"));
		
	System.out.println("****d1****");
	System.out.println("integer"+d1.getref());
	System.out.println("****d2****");
	System.out.println("string"+d2.getref());
	System.out.println("****d1****");
	System.out.println("user"+d3.getref().getUser());
	
		
		
		

	}

}
