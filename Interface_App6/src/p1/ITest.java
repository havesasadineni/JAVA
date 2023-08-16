package p1;

public interface ITest {
	public  abstract void m1(int a);
	public default void m2(int b)
	{
      System.out.println("***m2()***");
      System.out.println("b="+b);
	}

}
