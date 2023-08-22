package maccess;

public class DemoWrapperClass2 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//boxing process
		Integer ob1 = new Integer(12);// int as para
		Integer ob2 = new Integer("12");//int in str as para
		Float ob3 = new Float(12.34F);//float as para
		Float ob4 = new Float("12.34F");//float in string form
		Float ob5 = new Float(12.34);//float in double form
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("true");
		//UnBoxing process
		int i1 = ob1.intValue();
		int i2 = ob2.intValue();
		float f1 = ob3.floatValue();
		double d = ob4.doubleValue();
		float f2 = ob5.floatValue();
		char ch = ob6.charValue();
		boolean b1 = ob7.booleanValue();
		boolean b2 = ob8.booleanValue();
		System.out.println("====DisplayValues====");
		System.out.println("i1:"+i1);
		System.out.println("i2:"+i2);
		System.out.println("f1:"+f1);
		System.out.println("d:"+d);
		System.out.println("f2:"+f2);
		System.out.println("ch:"+ch);
		System.out.println("b1:"+b1);
		System.out.println("b2:"+b2);
	}

}
