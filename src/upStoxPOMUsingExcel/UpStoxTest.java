package upStoxPOMUsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
            driver.get("https://login-v2.upstox.com/");
            Thread.sleep(2000);
     
    		 File myfile = new File("D:\\poiFiles\\poi-bin-5.2.3-20220909\\New XLSX Worksheet.xlsx");
    		 
    		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
    		String un = mysheet.getRow(0).getCell(0).getStringCellValue();
    		 
    		 
//Create object of login page class
    		 
    
	         UpStoxLoginPage login = new UpStoxLoginPage(driver);	 
             login.enterUserID(un);
             login.enterPassward(mysheet.getRow(0).getCell(1).getStringCellValue());
             login.clickOnSignInButton();
		
//Create obj of passcode page
            Thread.sleep(2000);
            UpStoxPasscodePage pp = new UpStoxPasscodePage(driver);
	     	pp.enterPasscode( mysheet.getRow(0).getCell(3).getStringCellValue());
		
//Create object of welcome page
	     	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
	     	WelComePage1 page=new WelComePage1(driver);
	     	page.clickOnButton();		
		
//Create object of home page
	     	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	     	HomePage hp = new HomePage(driver);
		    hp.getUsername();
		    hp.clickOnFunds();
		
	}

}
