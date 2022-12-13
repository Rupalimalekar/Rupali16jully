package serialParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest1 {
  @Test
  public void test1()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
       driver.get("https://vctcpune.com/");  
	  
	  
  }
}
