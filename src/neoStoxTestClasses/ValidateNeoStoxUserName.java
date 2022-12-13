package neoStoxTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxUtility.Utility;
import neostoxPOM.HomePage;
import neostoxPOM.NeoSignUpPage;
import neostoxPOM.PasswordPage;

public class ValidateNeoStoxUserName extends Base
{   NeoSignUpPage signup;
    PasswordPage password;
    HomePage home;
    
    @BeforeClass
	public void launchNeoStox() throws InterruptedException
	{  launchBrowser();
    	signup= new NeoSignUpPage(driver);
    	password = new PasswordPage(driver);
    	home = new HomePage(driver);
	}
	
    @BeforeMethod
    public void loginNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	signup.enterMobNO(driver, Utility.readDataFromExel(4, 0));
    	signup.clickONSignUp();
    	Utility.wait(driver, 2000);
    	password.enterPassword(driver, Utility.readDataFromExel(4, 1));
    	password.clickOnSubmitButton();
    	Thread.sleep(2000);
    	home.handlePopUp(driver);
    }
	
  @Test
  public void validateUserName() throws InterruptedException, EncryptedDocumentException, IOException
  {Thread.sleep(6000);
	 Assert.assertEquals(home.getActualUserName(driver),Utility.readDataFromExel(4, 2),"TC is failed Actual and Expected not match");
	  Utility.screenShot(driver, home.getActualUserName(driver));
  }
  
  @Test
  public void validateAccBalance()
  {
	  Assert.assertNotNull(home.getBalance(driver));
	  Reporter.log("ACC balance is"+home.getBalance(driver), true);
  }
  
  
  
  @AfterMethod  
  public void logout()
  {
	  home.logoutFromNeoStox(driver);
	  
  }
  
  @AfterClass (enabled=true)
  
  public void closeApp()
  {
	  driver.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
