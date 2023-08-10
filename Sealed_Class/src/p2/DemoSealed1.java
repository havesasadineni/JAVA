package p2;
import p1.*;
public class DemoSealed1 {
public static void main(String[] args) {
B ob1 = new B();
C ob2 = new C();
E ob3 = new E();
System.out.println("****ob1****");
ob1.mA();
ob1.mB();
System.out.println("****ob2****");
ob2.mA();
ob2.mC();
System.out.println("****ob3*****");
ob3.mA();
ob3.mD();
ob3.mE();
}
}