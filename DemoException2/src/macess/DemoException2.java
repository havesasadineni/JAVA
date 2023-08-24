package macess;
import java.util.*;
import test.*;

public class DemoException2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the value k:");
			int k = s.nextInt();
			Class c = Class.forName("test.Display");//MethodCall
			test.Display ob = (test.Display)c.newInstance();
			ob.dis(k);
			
		}
		catch(InputMismatchException e)
		{
		System.out.println("Enter only Integer value..");
		}
		catch(ClassNotFoundException cnfe)
		{
		cnfe.printStackTrace();
		}

		catch(InstantiationException ie)
		{
		ie.printStackTrace();
		}
		catch(IllegalAccessException iae)
		{
		iae.printStackTrace();
		}
		finally
		{
		s.close();
		}

	}

}
