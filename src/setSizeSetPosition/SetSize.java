package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
      
			driver.get("https://kite.zerodha.com/");
 //How to get size 
			Dimension defaultSize = driver.manage().window().getSize();
            System.out.println(defaultSize);
// to set the size we need to create object of Dimenssion class and pass width and height
            Dimension d=new Dimension(1200,255);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		Dimension d1= new Dimension(900,600);
		driver.manage().window().setSize(d1);
		
		
	}

}
