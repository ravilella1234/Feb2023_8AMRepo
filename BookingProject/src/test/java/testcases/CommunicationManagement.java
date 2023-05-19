package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CommunicationManagement 
{
	
  @Test
  public void emailConfirmation(ITestContext context) 
  {
	  String bookingID = (String)context.getAttribute("bID");
	  System.out.println("emailConfirmation" +  bookingID);
  }
  
  @Test
  public void mobileConfirmation(ITestContext context) 
  {
	  String bookingID = (String)context.getAttribute("bID");
	  System.out.println("mobileConfirmation" + bookingID);
  }
  
}
