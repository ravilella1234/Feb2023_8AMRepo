package hdfc.loans.caraloans;

public class B extends A // ISA Relationship
{
	public void m1()
	{
		System.out.println("iam m1 overriden in B");
	}
	
	
	public void m2()
	{
		System.out.println("iam m2 from B");
	}
	
	public static void main(String[] args) 
	{
		A a = new A(); // HasA Relationship
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
		m4();
	}

}
