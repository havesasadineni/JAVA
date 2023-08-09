package p2;
import p1.*;
import java.util.*;

public class DemoBank extends Exception {
	public DemoBank(String msg)
	{
	super(msg);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try
		{   int count=0;
			xyz:while(true) 
			{
				try
				{
					System.out.println("Enter the pinNo:");
					int pinNo = s.nextInt();
					CheckPinNo cpn = new CheckPinNo();
					boolean k = cpn.verify(pinNo);
					if(!k)//Exception-Condition
					{
					DemoBank db =
					new DemoBank("Invalid pinNo");

					throw db;
					}
					
					System.out.println("****Choice****");
					System.out.println("\t1.WithDraw"+"\n\t2.Deposit");
					System.out.println("Enter the Choice:");
					int choice = s.nextInt();
					switch(choice)
					{
					
					case 1:
						try
						{
							System.out.println("Enter the amt:");
							int a1 = s.nextInt();
							if(!(a1>0 && a1%100==0))//Exception-condition
							{
							DemoBank db2 = new DemoBank("Invalid amt");
							throw db2;
							}
							Transaction ob1 = new Transaction()
						    {
								public void process(int amt)throws Exception
								{
									try
									{
										if(amt>b.bal)
										{
											Exception wd1 =new Exception("Insufficient fund");
													
													throw wd1;
										}
										System.out.println("Amt withDrawn:"+amt);
										b.bal=b.bal-amt;
										System.out.println("Balance amt:"+b.getBal());

										System.out.println("Transaction Completed...");
									}
									
									catch(Exception wd1)
									{
									throw wd1;//Exception re-throwing process
									}
									
								}	
						    };
							
							ob1.process(a1);
						    }
								    
						catch(DemoBank db2)
						{
						System.out.println(db2.getMessage());
						}
						catch(Exception wd1)
						{
						System.out.println(wd1.getMessage());
						}
						break xyz;//stop while loop
						
						
				   case 2:
					   try
					   {
					   System.out.println("Enter the amt:");
					   int a2 = s.nextInt();
					   if(!(a2>0 && a2%100==0))
					   {
					   DemoBank db3 = new DemoBank("Invalid amt");
					   throw db3;
					   }
					   Transaction dp = new Transaction()
					   {
					   public void process(int amt) {
					   System.out.println("Amt deposited:"+amt);
					   b.bal=b.bal+amt;
					   System.out.println("Balance amt:"+b.getBal());
					   System.out.println("Transaction Completed...");
					   }
					   };
					   dp.process(a2);
					   }//end of try
					   catch(DemoBank db3)
					   {
					   System.out.println("Invalid amt...");
					   }
					   catch(Exception e)
					   {
					   e.printStackTrace();
					   }
					   break xyz;//stop while loop
				
				  }
							
						
				}
				catch(DemoBank db)
				{
				System.out.println(db.getMessage());
				count++;
				if(count==3)
				{
				System.out.println("Sorry ! Transaction blocked..");
				break;//stops the while loop
				}
				
			}
		}
		
	}
    finally
    {
    	s.close();
    }

}}
