package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEg {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
      driver.get("http://demo.guru99.com/test/simple_context_menu.html");
      		
        //Mouse Action
      
      //Create obj of action class
      
      Actions act= new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//Type 1	
	//	act.moveToElement(doubleclick).perform();
	//	act.doubleClick().perform();
		
//Type 2
//	 act.moveToElement(doubleclick).doubleClick().build().perform();
		
//Type 3
		act.doubleClick(doubleclick).perform();
		
		
		
		
		
		
		
		
		
      
	}

}
