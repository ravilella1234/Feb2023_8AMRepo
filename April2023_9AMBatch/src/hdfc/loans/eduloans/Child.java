package hdfc.loans.eduloans;

class Parent
{
	public Number workhard() 
	{
		System.out.println("Parent : Wakeup early,goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}


public class Child extends Parent
{
	public Number workhard() 
	{
		System.out.println("Child : Wakeup anytime,goto movie...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.love();
		obj.workhard();
		obj.care();
	}
}
