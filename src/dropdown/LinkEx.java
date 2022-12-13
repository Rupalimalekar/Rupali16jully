package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkEx {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://google.com/");
         
			List<WebElement> result = driver.findElements(By.tagName("a"));

		for(WebElement re:result)
		{
			System.out.println(re.getText());
		}
//*****************************************************************************************
		System.out.println("================================");
	List<WebElement> images = driver.findElements(By.tagName("img"));
		
	System.out.println(images.size());
	
		for(WebElement im:images)
		{
			System.out.println(im.getText());
		}
		
		
		
		
		
		
		
	}

}
