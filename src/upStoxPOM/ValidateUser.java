package upStoxPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
        driver.get("https://login-v2.upstox.com/");
        Thread.sleep(2000);

         driver.findElement(By.name("userId")).sendKeys("4VB2TE");
         driver.findElement(By.name("password")).sendKeys("Soma@7756");
         driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
         
         Thread.sleep(2000);
         driver.findElement(By.name("yob")).sendKeys("2001");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		String actualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
		
		String expectedUN = "Somnath M.";

//Validating actual and expected user name
		if(actualUN.equals(expectedUN))
		{
			System.out.println("Username matching TC is Passed");
		}
		
		else
		{
			System.out.println("Username not matching TC is Failed");
		}
		
		//check funds
		
		driver.findElement(By.id("funds")).click();
		Thread.sleep(2000);
		
		String myFunds = driver.findElement(By.xpath("((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[4]")).getText();
		System.out.println("Fund Available to trade is "+myFunds);
		
		
		
		
		
		
		
		
		
	}

}
