package neostoxPOM;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxUtility.Utility;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();

             driver.get("https://neostox.com/");
		
//create object of sign up page
             
             NeoSignUpPage signUp = new NeoSignUpPage(driver);
		      signUp.enterMobNO(driver, Utility.readDataFromExel(4, 0));
		      signUp.clickONSignUp();
		
//Create object of password page
		       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		       PasswordPage password = new PasswordPage(driver);
		        password.enterPassword(driver, Utility.readDataFromExel(4, 1));
		    	Thread.sleep(2000);
		        password.clickOnSubmitButton();
		
//Create object of home page
		        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		        HomePage home = new HomePage(driver);
		       home.handlePopUp(driver);
		       Thread.sleep(1000);
               home.getActualUserName(driver);
    //           home.getAccBalance(driver);
		        
	}

	}
