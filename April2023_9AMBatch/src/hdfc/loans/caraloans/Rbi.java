package hdfc.loans.caraloans;

public interface Rbi 
{
	int x = 10;
	
	public void withdrawl();
	public void deposit(); 

	public static void main(String[] args) 
	{
		 //Rbi i = new Rbi();
		
		Rbi i ;
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
	}
}
