package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartReview {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/");
         
         driver.findElement(By.xpath("//button[text()='✕']")).click();
         driver.findElement(By.name("q")).sendKeys("Iphone 14 max");
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         
         Thread.sleep(5000);
         String text = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
         
         System.out.println("Todays reviews are "+text);

		
		
		
		
		
		
		
		
		
		
		
	}

}
