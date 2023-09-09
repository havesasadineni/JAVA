package maccess;
import java.util.*;
public class DemoList3 {
@SuppressWarnings("removal")
public static void main(String[] args) {
ArrayList<Float> al = new ArrayList<Float>();
al.add(new Float(17));
al.add(new Float(10));
al.add(new Float(14));
al.add(new Float(12));
al.add(new Float(119));
System.out.println("====List<E>====");
System.out.println(al.toString());
System.out.println("====replaceAll()====");
al.replaceAll((x)->
{

return x+(0.4F*x);
});
System.out.println(al.toString());
}
}