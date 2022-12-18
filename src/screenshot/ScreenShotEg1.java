package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws IOException 
	{

	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
             driver.get("https://vctcpune.com/");
             File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      		System.out.println(source);
      		File destination=new File("D:\\ScreenshotsFile\\screenshotFile2.png");
      		FileHandler.copy(source, destination);
		
      
      		
      		
      		
      		
            driver.get("https://facebook.com/");
            File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     		System.out.println(source);

     		File destination1=new File("D:\\ScreenshotsFile\\screenshotFile3.png");
     		
     		FileHandler.copy(source1, destination1);

		
		
	}

}
