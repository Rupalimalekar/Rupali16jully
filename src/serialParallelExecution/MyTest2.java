package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void test2() 
  {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

driver.get("https://www.amazon.com/");
  
	  
  }
}
