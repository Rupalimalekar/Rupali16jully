package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew
{
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{//Create object of properties class---java
		Properties prop = new Properties();
		
		//Create object of inputStream & pass properties file path as a parameter
		FileInputStream myFile = new FileInputStream("C:\\rupali\\rupali\\rupali\\src\\rupali\\seleniumDemo\\NeoStox.properties");
		prop.load(myFile);
		
		String value = prop.getProperty(key);
		Reporter.log("Reading"+ key +"from property file", true);
		return value;
	}
	
	public static void screenShot(WebDriver driver,String screenShotname) throws IOException
	{    wait(driver,600);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\ScreenshotsFile"+screenShotname+"png");
		 FileHandler.copy(src, dest);
		 Reporter.log("Taking Screenshot", true);
	}
	
	public static void scrollintoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].ScrollintiView( true),element");
	     Reporter.log("Scrolling into view",true);
	}

	public static void wait(WebDriver driver, int timetoWait)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timetoWait));
		Reporter.log("Waiting for"+timetoWait+"ms",true);
	}
	
	
	
	
	
	
	
	
	
	
	

}
