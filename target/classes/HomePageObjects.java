package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects{

	public WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	By register = By.cssSelector(".icon.fa.fa-user");
	By title = By.cssSelector(".col-md-6.text-left h2 span:nth-child(1)");
	
	public WebElement clickOption()
	{
        return driver.findElement(register);
	}
	
	public WebElement checkTitl()
	{
		//System.out.println("Check");
		return driver.findElement(title);
	}
}
