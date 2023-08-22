package maccess;

public class DemoWrapperClass1 {

	public static void main(String[] args) {
		Integer ob1 = new Integer(12);// int as para
		Integer ob2 = new Integer("12");//int in str as para
		Float ob3 = new Float(12.34F);//float as para
		Float ob4 = new Float("12.34F");//float in string form
		Float ob5 = new Float(12.34);//float in double form
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("true");
		System.out.println("====Display from WrapperClass Objects===");
		System.out.println("ob1:"+ob1.toString());
		System.out.println("ob2:"+ob2.toString());
		System.out.println("ob3:"+ob3.toString());
		System.out.println("ob4:"+ob4.toString());
		System.out.println("ob5:"+ob5.toString());
		System.out.println("ob6:"+ob6.toString());
		System.out.println("ob7:"+ob7.toString());
		System.out.println("ob8:"+ob8.toString());

	}

}
