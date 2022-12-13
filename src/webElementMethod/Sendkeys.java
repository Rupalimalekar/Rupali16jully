package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
	//	 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Good Evining");
		
	 driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
	 
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("HELLO");
		
		
	}

}
