package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class base {

	public WebDriver driver;
	@Test
	public WebDriver get() throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dakshinamurthi\\eclipse-workspace\\PriyaProject\\src\\main\\java\\resources\\data.properties");
		p.load(fis);
		if(System.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dakshinamurthi\\\\Documents\\\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get(p.getProperty("url"));
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public String screen(WebDriver driver, String testcasePath) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+testcasePath+".png";
		FileUtils.copyFile(src,new File(destination));
		return destination;
	}
}
