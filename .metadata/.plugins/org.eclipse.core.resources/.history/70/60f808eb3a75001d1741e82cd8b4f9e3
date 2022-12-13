package neoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility
{
	
	public static String readDataFromExel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\poiFiles\\poi-bin-5.2.3-20220909\\New XLSX Worksheet.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void screenShot(WebDriver driver,String screenShotname) throws IOException
	{    wait(driver,600);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:\\ScreenshotsFile"+screenShotname+"png");
		 FileHandler.copy(src, dest);
		 Reporter.log("Taking Screenshot", true);
	}
	
	public static void scrollintoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].ScrollintiView( true),element");
	     Reporter.log("Scrolling into view",true);
	}

	public static void wait(WebDriver driver, int timetoWait)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timetoWait));
		Reporter.log("Waiting for"+timetoWait+"ms",true);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
