package icici.loans.exceptions;

import java.util.Scanner;

public class UserDefineException 
{

	public static void main(String[] args) 
	{
		String str;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		
		if(str.length()!=10)
			throw new UserDefineException();
	}

}
