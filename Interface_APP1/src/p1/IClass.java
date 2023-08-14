package p1;
public class IClass implements ITest{

public void m1(int x)
{
	System.out.println("***m1(x)***");
	System.out.println("The value x:"+x);
}
public void m2(int y)//implemented and Overrided_method
{
System.out.println("***m2(y)***");
System.out.println("The value y:"+y);
}
public void m3(int z)//implemented and Overrided_method
{
System.out.println("***m3(z)***");
System.out.println("The value z:"+z);
}
public void m4(int a)//NonImplemented and NonOverrided_method
{
System.out.println("***m4(a)***");
System.out.println("The value a:"+a);
}
}

