package test;
import java.util.*;
import maccess.*;

public class DemoArray3 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Object ob[] = new Object[3];
		ob[0]=new Integer(121);
		ob[1]=new String("Nit-hyd");
		ob[2]=new User("nit.v","v@gmail.com");
		System.out.println("display from Array");
		Spliterator <Object>sp =Arrays.spliterator(ob);
		sp.forEachRemaining((k)->
		{
			System.out.println("Object:"+k.toString());
		});
		
				
		
		
	}
}
				
