package scrollingByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.CommonlyUseMethods;

public class EgOfJavascriptExecutor {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		 
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			CommonlyUseMethods.methodForWait(driver,2000);

			
			//Sendkeys using javascriptExecutor
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        WebElement clickOnRadioButton = driver.findElement(By.name("radio"));
			js.executeScript("arguments[0].click();",clickOnRadioButton);
			
			
	//Click using javascriptExecutor
			WebElement useSendkeysJS = driver.findElement(By.id("autocomplete"));
			CommonlyUseMethods.scrollIntoView(driver,useSendkeysJS); 
			js.executeScript("arguments[0].value='Rupali'", useSendkeysJS);
			
		}


		
		
		
		
		
		
		
		
		
		
	}


