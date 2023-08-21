package maccess;
public class DemoString7 {
public static void main(String[] args) {
System.out.println("===UpperCase Alphabets===");
for(int i=65;i<=90;i++)
{
char ch = (char)i;//ASCII code to char
System.out.print(ch+" ");

}//end of loop
System.out.println("\n===LowerCaseAphabets====");
for(int i=97;i<=122;i++)
{
char ch = (char)i;
System.out.print(ch+" ");
}//end of loop
System.out.println("\n===Numeric-numbers====");
for(int i=48;i<=57;i++)
{
char ch = (char)i;
System.out.print(ch+" ");
}//end of loop
}
}