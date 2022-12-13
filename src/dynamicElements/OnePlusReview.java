package dynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlusReview {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		driver.findElement(By.name("q")).sendKeys("oneplus");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		String myRates = driver.findElement(By.xpath("(//div[@class='gUuXy- _2D5lwg'])[4]")).getText();
		System.out.println(myRates);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
