package disiredCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationStudy {

	public static void main(String[] args) throws InterruptedException
	{


		  ChromeOptions op = new ChromeOptions();
		  op.addArguments("--disable-notifications");
		  
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(op);
		  
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.get("https://www.justdial.com/");
		  Thread.sleep(2000);
		  
		  String text = driver.findElement(By.xpath("//span[text()='Popular Services ']")).getText();

		System.out.println("Text is "+text);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
