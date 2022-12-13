package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaynamicListDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone14");

			Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@role='option'])[2]")).click();
		
            Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[4]")).click();
		
		  List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		Thread.sleep(2000);
		System.out.println("****************************************************************");
		
	  for(WebElement i:images)
	  {
		  System.out.println(i.getText());
	  }
		
		
		
		
		
		
	}

}
