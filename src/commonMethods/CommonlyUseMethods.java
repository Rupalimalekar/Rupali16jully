package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUseMethods 
{
 
    public static void takeScreenShot(WebDriver driver,String name) throws IOException
    {
    	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
		File dest=new File("D:\\\\ScreenshotsFile\\\\screenshotFile"+name+".png");
		FileHandler.copy(src, dest);
    }
	
	
// Scrolling into View
    
    public static void scrollIntoView(WebDriver driver,WebElement element)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", element);
    	
    }
	

//Wait
    
 //   public static void methodForWait(WebDriver driver,int no)
    {
 //   	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }


	public static void methodForWait(WebDriver driver, int no) 
	{
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
