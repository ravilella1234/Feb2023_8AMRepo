package hdfc.loans.caraloans;

public class SecondClass 
{
	//Data - DataProperties
	int a = 10, b=20, result;
	
	//Operation - Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is : " + result);
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A &  B is : " +  result);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello...");
		
		SecondClass obj = new SecondClass();
		obj.add();
		obj.sub();
		
		SecondClass obj1 = new SecondClass();
		obj1.add();
		obj1.sub();
	}
}
