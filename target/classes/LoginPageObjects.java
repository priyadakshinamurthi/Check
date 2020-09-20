package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	By name = By.id("user_name");
	By email = By.id("user_email");
	By password = By.id("user_password");
	By cpassword = By.id("user_password_confirmation");
	
	public WebElement name()
	{
		return driver.findElement(name);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement cpassword()
	{
		return driver.findElement(cpassword);
	}
	
	
}
