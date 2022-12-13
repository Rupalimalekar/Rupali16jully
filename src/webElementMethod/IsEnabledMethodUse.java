package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
	Thread.sleep(5000);
     driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
	Thread.sleep(2000);
   	driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
   	WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
   	
   	System.out.println(getOTPButton.isEnabled());
         getOTPButton.click();
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		System.out.println(getOTPButton.isEnabled());
		
		getOTPButton.click();

	}

}
