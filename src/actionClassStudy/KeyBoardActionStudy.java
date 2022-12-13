package actionClassStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionStudy {

	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            WebElement userName = driver.findElement(By.id("email"));
          //  userName.sendKeys("Hii");
           
       Actions act = new Actions(driver);
		
      // act.moveToElement(userName).sendKeys("Hello").build().perform();
		
	 act.sendKeys(userName, "How are you").perform();
	 
	 WebElement createacc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		act.click(createacc).perform();
		Thread.sleep(5000);
		
		//WebElement day =
				driver.findElement(By.xpath("//select[@id='day']")).click();
	//	act.click(day).perform();
		
//Assignment of copy paste
				WebElement copy = driver.findElement(By.name("firstname"));
				WebElement paste = driver.findElement(By.name("lastname"));
				
			act.moveToElement(copy).click().sendKeys("Rupali");
		act.keyDown(copy,Keys.CONTROL).sendKeys("a").build().perform();
			act.sendKeys("c").perform();
			Thread.sleep(1000);
			
			act.moveToElement(paste).click().perform();
			act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		


	}

}
