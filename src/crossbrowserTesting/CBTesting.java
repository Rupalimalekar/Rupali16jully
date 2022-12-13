package crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CBTesting {
  @Test
  public void browserTesting()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
	  
	   WebDriver driver= new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");

	  
  }
}
