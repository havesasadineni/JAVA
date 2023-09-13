package maccess;
import test.Cars;

public class DemoEnum {
		public static void main(String[] args)
		{
		Cars c[] = Cars.values();
		System.out.println("====Display from Enum-object====");
		for(Cars k : c)
		{
		System.out.println(k.toString()+" Costs "+
		k.getPrice()+" Thousand Dollars...");

		}
		}
}
