package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
        
			driver.get("https://kite.zerodha.com/");
			
	//		Thread.sleep(10000);

//Using dynamic wait--->implicit wait
			
		//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//	driver.manage().timeouts().implicitlyWait(0, null)
		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(1000));
		w.until(ExpectedConditions.elementSelectionStateToBe(driver.findElement(By.xpath("//button[text()='Login ']")), true));
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		
		
		
		
		
		
	}

}
