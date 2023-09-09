package maccess;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortProcess implements Comparator{
public int compare(Object ob1,Object ob2) {
Integer i1 = (Integer)ob1;
Integer i2 = (Integer)ob2;
if(i1==i2) return 0;

else if(i1>i2) return 1;
else return -1;
}
}