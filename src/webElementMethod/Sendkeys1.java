package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys1 {

	public static void main(String[] args) throws InterruptedException
	{   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
driver.get("https://www.facebook.com/");


           driver.findElement(By.id("pass")).sendKeys("rupali7756");

           Thread.sleep(2000);
           driver.findElement(By.id("pass")).clear();






	}

}
