package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;
import neoStoxUtility.UtilityNew;

public class NewBase 
{
	protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		  
		  
			WebDriver driver= new ChromeDriver();
			driver.get(UtilityNew.readDataFromPropertyFile("Url"));
			driver.manage().window().maximize();
            Reporter.log("Launching browser", true);
            Utility.wait(driver, 1000);        
	}
	
	public void closingBrowser() throws InterruptedException
	{
		Reporter.log("Closing browser", true);
		Thread.sleep(500);
		driver.close();
		
	}
	
	
	
	
	

}
