package Priya;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import resources.HomePageObjects;
import resources.base;

public class validateTitle extends base{

	public WebDriver driver;
	private static Logger log = LogManager.getLogger(validateTitle.class.getName());
	@Test
	public void titleCheck() throws IOException, InterruptedException
	{
		driver = get();
		HomePageObjects home = new HomePageObjects(driver);
		String t =home.checkTitl().getText();
		Thread.sleep(5000);
		Assert.assertEquals("An Academy to Learn Earn & Shine  in your QA Career", t);
		log.info("Success");
    }
	
	@AfterTest
	public void close()
	{
		log.info("close");
		driver.close();
	}
	
	@Test(enabled=false)
	public void Pr()
	{
		System.out.println("Dont Print");
	}
}
