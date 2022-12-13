package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");

		WebElement texbox = driver.findElement(By.id("displayed-text"));
		
		texbox.sendKeys("Hi Good Afternoon");
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		//driver.findElement(By.id("show-textbox"));
		hidebutton.click();
		
		if(texbox.isDisplayed())
		{
			texbox.sendKeys("Hi Good Afternoon");
		}
		else
		{
			System.out.println("Texbox is not displayed,plz check");
		}
		
		
	}

}
