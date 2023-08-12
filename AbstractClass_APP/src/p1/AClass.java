package p1;

public abstract class AClass {
	public int a,b;
	public AClass(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	{
		System.out.println("***Instance block***");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
	public void getValues() 
	{
		System.out.println("***Instance method***");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
	
	public abstract void addValues();
	

}
