package icici.loans.exceptions;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr, dr, result;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) 
		{
			System.out.println("Enter the Nr : ");
			nr = sc.nextInt();
			System.out.println("Enter the Dr :");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
		}
		
	}

}
