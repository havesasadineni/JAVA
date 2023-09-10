package maccess;
import java.util.*;
public class DemoList4 {
@SuppressWarnings("removal")
public static void main(String[] args) {
LinkedList<Integer> ob =
new LinkedList<Integer>();
ob.add(new Integer(11));
ob.add(new Integer(17));

ob.add(new Integer(10));
ob.add(new Integer(11));
ob.add(new Integer(17));
ob.add(new Integer(10));
System.out.println(ob.toString());
System.out.println("=====Display-Backward====");
Iterator<Integer> ob1 = ob.descendingIterator();
while(ob1.hasNext()) {
System.out.print(ob1.next()+" ");
}
}
}