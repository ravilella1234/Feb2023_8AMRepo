package hdfc.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; // instance variable
	static int batchcode = 2023; // static variable 
	static String cname = "vmware";
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
		
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

	public static void main(String[] args) 
	{
		 obj = new VariableTypes(); // non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
