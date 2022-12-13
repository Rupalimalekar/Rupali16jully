package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium {

	public static void main(String[] args)
	{
          System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
          
          
          WebDriver driver = new ChromeDriver();
          
          driver.get("https://www.intstagram.com/");
          
    driver.close();
     
     driver.manage().window().maximize();
     
     
      driver.manage().window().minimize();
      
      driver.quit();
          
          
	}

}
