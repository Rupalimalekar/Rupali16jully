package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;




import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg3 {

	public static void main(String[] args) throws IOException
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

				WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();

               driver.get("https://www.facebook.com/");
               
       //        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  File sorce = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(sorce);
		
		File dest=new File("D:\\\\ScreenshotsFile\\\\screenshotFile3.png");
		
		FileHandler.copy(sorce, dest);
		
		
		
		
		
		
		
		
	}

}
