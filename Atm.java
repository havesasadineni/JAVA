/* atm transaction*/
import java.util.Scanner;
class  Atm
{
  public static void main(String[] args) 
  {   
	int balance = 2000;
    Scanner s= new Scanner(System.in);
    int count=0;
	
	while( count<3)
	{
	 System.out.println("Enter pin ");
	 int pin = s.nextInt();
	 
	 if (pin<1000||pin>9999)
	 {
       System.out.println("Invalid pinNo");
	   count++;
	 }
	  
	 else if(pin>=1000&& pin <=9999)
	 { 	  
	    if(pin!=(1111)&&pin!=(2222)&&pin!=(3333)&&pin!=(4444))
	   {
		  System.out.println("PinNo donot exist");
          count++;
	   }
	    else
		{
		 count=1;
		 System.out.println("pin is correct");
		 break;
		}
				
	  }
				
	 }
          
	if (count>=3)
	{
		System.out.println("Transaction blocked");
	}
	else if(count ==1)
	{
	 System.out.println("enter the amount");
	 int amount= s.nextInt();
             
	 if (amount<0|| amount%100!=0)
	 {
	  System.out.println("invalid amt");
     }
     else if (balance< amount)
     {
	  System.out.println("insufficient fund");
     }           
     else 
	  {
				 System.out.println("Amt withDraw:"+amount);
                 System.out.println("balance amt:"+(balance-amount));
                 System.out.println("transaction successfull");
				 
       }
     }
   }
}
  

