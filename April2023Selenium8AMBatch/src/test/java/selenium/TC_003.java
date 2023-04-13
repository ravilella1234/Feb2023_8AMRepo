package selenium;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropdown_id","Books");
		
		typeText("amazonsearchtext_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		//WebElement element = driver.findElement(By.id("searchDropdownBox"));
		//element.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	}

	
}
