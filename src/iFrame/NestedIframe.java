package iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

					WebDriver driver= new ChromeDriver();
					
					driver.manage().window().maximize();

					driver.get("https://demoqa.com/nestedframes");
					
				//driver.switchTo().frame("course-iframe");
					//Thread.sleep(5000);
					 //driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
					
		 driver.switchTo().frame("frame1");
		
		Thread.sleep(2000);
		
		String myText = driver.findElement(By.xpath("//iframe[text()='Child Iframe']")).getText();
		
		System.out.println(myText);
		
		

	}

}
