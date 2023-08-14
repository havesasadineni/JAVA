package p2;
import p1.*;
import java.util.*;

public class DemoInterface1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("****main()****");
		System.out.println("The value k:"+ITest.k);//ITest ob = new ITest();//Error
		System.out.println(";Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		System.out.println("Enter the value of z:");
		int z = s.nextInt();
		System.out.println("Enter the value of a:");
		int a = s.nextInt();
		IClass ob = new IClass();//Implementation Object

		ob.m1(x);
		ob.m2(y);
		ob.m3(z);
		ob.m4(a);
		s.close();

}}
