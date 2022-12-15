package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException
	{

	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

				WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();

				
				
				
				
				
		driver.get("https://www.amazon.com/");
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		String random =RandomString.make(3);
		
		File dest=new File("D:\\ScreenshotsFile\\screenshotfile1"+random+".png");
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
	}

}
