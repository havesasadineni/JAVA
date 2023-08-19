
	package p1;
	public class CClass extends PClass{
	public static void show(int a,int b) {

	//super.m(a);//Error
	System.out.println("***show(a,b)***");
	System.out.println("CClass a:"+a);
	System.out.println("CClass b:"+b);
	}
	public static void show(int a,int b,int c) {
	//this.show(a,b,c);//Error
	System.out.println("***show(a,b,c)***");
	System.out.println("CClass a:"+a);
	System.out.println("CClass b:"+b);
	System.out.println("CClass c:"+c);
	}
	public void access(int a,int b,int c)
	{super.show(a);
	 this.show(a,b);
	 this.show(a,b,c);
	
	}
	

	}
