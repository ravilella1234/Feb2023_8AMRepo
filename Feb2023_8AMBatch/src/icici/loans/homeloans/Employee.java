package icici.loans.homeloans;

public class Employee 
{
	int eno;
	String ename;
	float sal;
	
	public Employee()
    {
		System.out.println("iam default constructor...");
    }
	
	public Employee(int eno, String ename) 
	{
		this.eno = eno;
		this.ename = ename;
	}

	public Employee(int i) 
	{
		eno = i;
	}

	public Employee(int eno, String ename, float sal) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		
		Employee e2 = new Employee(1744,"sai");
		System.out.println(e2.eno);
		System.out.println(e2.ename);
		
		Employee e3 = new Employee(1745);
		
		Employee e4 = new Employee(1746,"ravi",12.34f);
	}
}
