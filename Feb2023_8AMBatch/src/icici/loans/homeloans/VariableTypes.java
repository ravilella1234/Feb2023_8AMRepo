package icici.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x = 100; // primitive instance (or) primitive global (or) primitive non-static
	static String cname = "vmware"; // primitive static (or) primitive static global
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 200; // primitive local
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		//VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		//VariableTypes obj = new VariableTypes(); // non-primitive (or) reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
}
