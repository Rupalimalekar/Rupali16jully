package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpEg {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
             driver.get("https://demoqa.com/alerts");

		  driver.findElement(By.id("alertButton")).click();
		
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();
    
		System.out.println("Alert text is "+alt.getText());
		
		alt.accept();
		
		
	}

}
