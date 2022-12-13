package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGStudy {
	 @Test
	  public void f() {
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

					WebDriver driver= new ChromeDriver();
					
					driver.manage().window().maximize();

					driver.get("https://vctcpune.com/selenium/practice.html");

	  }
	 @Test 
	 public void fbLogin()
	 {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/");

	 }
	  
}