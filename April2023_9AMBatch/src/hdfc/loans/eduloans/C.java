package hdfc.loans.eduloans;

import hdfc.loans.caraloans.A;
import hdfc.loans.caraloans.B;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam m1 overriden in C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from C");
	}
	
	public static void main(String[] args) 
	{
		B b = new B();
		b.m2();
		b.m1();
		
		C c = new C();
		c.m3();
		c.m1();
		m4();
	}

}
