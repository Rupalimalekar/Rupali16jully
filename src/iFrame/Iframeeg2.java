package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg2 {

	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(2000);
			driver.switchTo().frame("courses-iframe"); //switching selinium focus from main page to ifrme
Thread.sleep(2000);
	String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]")).getText();
		
		System.out.println(myText);
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		String myText1 = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		
		System.out.println(myText1);
		
		driver.findElement(By.xpath("//a[text()='HOME ']")).click();
		
		driver.switchTo().frame("courses-iframe");
		
		
	}

	
		
	

}
