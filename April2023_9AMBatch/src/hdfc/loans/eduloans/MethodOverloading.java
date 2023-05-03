package hdfc.loans.eduloans;

public class MethodOverloading 
{
	
	//A class cannot contain 2 same methods with same signatures, otherwise it’s a CE
	
	/*public void m1(int i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(float i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(String i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(Integer i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(Number i)
	{
		System.out.println(i);
	}*/
	
	public void m1(Object i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravilella");
		obj.m1(200);
		obj.m1(3.34f);
		obj.m1("kiran");
	}
}
