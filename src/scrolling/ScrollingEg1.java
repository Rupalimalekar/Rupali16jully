package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException
	{


		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("Window.scrollBy(O,9000)");
			
			Thread.sleep(1000);
			js.executeScript("Window.scrollBy(O,-600)");
			
			

	}

}
