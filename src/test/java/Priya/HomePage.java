package Priya;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import resources.HomePageObjects;
import resources.LoginPageObjects;
import resources.base;

public class HomePage extends base{
 
	/*public WebDriver driver;
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	@Test(dataProvider="getData")
	public void landingPage(String name,String email,String pass,String cpass) throws IOException, InterruptedException
	{
		driver = get();
		HomePageObjects home = new HomePageObjects(driver);
		home.clickOption().click();
		Thread.sleep(5000);
		LoginPageObjects logi = new LoginPageObjects(driver);
		logi.name().sendKeys(name);
		logi.email().sendKeys(email);
		logi.password().sendKeys(pass);
		logi.cpassword().sendKeys(cpass);
	}
	
	@Parameters("name1")
	@Test
	public void getDemo(String na)

	{
		System.out.println(na);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[1][4];
		obj[0][0] = "priya";
		obj[0][1] = "abcd@gmail.com";
		obj[0][2] = "abcd";
		obj[0][3] = "abcd";
		
		/*obj[1][0] = "aravinth";
		obj[1][1] = "efgh@gmail.com";
		obj[1][2] = "efgh";
		obj[1][3] = "efgh";
		
		return obj;
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}*/
}
