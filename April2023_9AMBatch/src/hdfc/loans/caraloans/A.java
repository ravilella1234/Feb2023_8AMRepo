package hdfc.loans.caraloans;

public class A 
{
	 int x = 100;
	
	public   void m1()
	{
		System.out.println("iam m1 from A");
		
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static method");
	}
	
	static
	{
		System.out.println("iam static block..");
	}
	
	

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		A.m4();
	}

}
