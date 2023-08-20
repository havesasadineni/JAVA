package maccess;
public class DemoString8 {
public static void main(String[] args) {
String str = "language";
String s1 = str.substring(4);
//from index 4 to end of String
String s2 = str.substring(2,6);
//from index 2 to index 5
System.out.println("s1 : "+s1.toString());
System.out.println("s2 : "+s2.toString());
}
}