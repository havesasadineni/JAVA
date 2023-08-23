package maccess;

public class DemoWrapperClass3 {

	public static void main(String[] args) {
		//AutoBoxing Process
		Integer ob1 = 12;
		Float ob2 = 12.34F;
		Character ob3 = 'A';
		Boolean ob4 = true;
		//AutoUnBoxing process
		int i1 = ob1;
		float f1 = ob2;
		char ch = ob3;
		boolean b = ob4;
		System.out.println("====Values=====");
		System.out.println("i1:"+i1);
		System.out.println("f1:"+f1);
		System.out.println("ch:"+ch);
		System.out.println("b:"+b);
	}

}
