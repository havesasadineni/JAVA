package test;
import java.util.*;

public class DemoSet1 {
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		try(s;)
		{
			Set<Integer>ob=null;
			String nm =null;
			try {
				while(true)
				{
					System.out.println("****Choices****");
					System.out.println("\t1.Hashset"+"\n\t2.LinkedHashSet"
					+"\n\t3.TreeSet"+"\n\t4.Exit");
					System.out.println("enter the choice");
					switch(s.nextInt())
					{
					case 1:
						ob=new HashSet<Integer>();
						nm ="HashSet";
						break; 
						
					case 2:
						ob=new LinkedHashSet<Integer>();
						nm ="LinkedHashSet";
						break; 
						
					case 3:
						ob=new TreeSet<Integer>();
						nm ="TreeSet";
						break; 
					
					case 4:
						System.out.println("operations Stopped..");
						System.exit(0);
						
					default:
						System.out.println("invalid choice...");
						continue;
							
					}
					System.out.println("performingoperations on"+nm);
					xyz:while(true)
					{
						System.out.println("\t1.add"+"\n\t2.remove"+"\n\t3.exit");
						System.out.println("Enter the choice");
						switch(s.nextInt())
						{
						case 1:
							System.out.println("Enter the element:");
							ob.add(new Integer(s.nextInt()));
							System.out.println(ob.toString());
							break;
							
						case 2:
							if(ob.isEmpty())
							{
								System.out.println("set is Empty");
							}
							else
							{
								System.out.println("Enter the ele to be removed");
								Integer e1 = new Integer(s.nextInt());
								if(ob.remove(e1))
								{
									System.out.println("element removed successfully...");
									
								}
								else {
									System.out.println("element not found ");
								}
							}
							
							break;
							
						case 3:
							System.out.println("Operations stoped on"+nm);
							break xyz;
							
						default:
							System.out.println("Invalid choice...");
							
						}
					}
				}
			}catch(Exception e) {e.printStackTrace();}
		}
	}

}
