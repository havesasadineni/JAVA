package p1;


public class Account  {
	public Customer ob3= new Customer();
	public  double balance=10000;
	public int accountNo;
	public float interestRate;
	public  void deposit(double amount)
	{ 
	balance = balance+amount;
	 System.out.println("amount after diposit:"+balance);
	}
	public  void withdraw(double amount2)
	{
		
		if (balance<amount2)
		{ System.out.println("cant withdraw amount is low");
		}
		else
		{balance=balance-amount2;
		 System.out.println("amount after withdraw:"+balance);}
	}
	
		public void Display()
		{
			System.out.println("amount available"+balance);
			System.out.println(" THANK YOU");
			
		}
}