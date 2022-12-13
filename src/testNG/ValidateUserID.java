package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
  @Test
  public void validateUpstoxUserID()
  {
	  Reporter.log("UserID validated",true);
  }
  
  @BeforeMethod
  public void loginToUpstox()
  {
	  Reporter.log("Login success...", true);
  }
  
  @AfterMethod
  public void LogoutFromUpstox()
  {
	  Reporter.log("Logging out", true);
  }
  
 @BeforeClass
 public void luanchBrowser()
 {
	 Reporter.log("Browser Launch", true);
 }
  
 @AfterClass
 public void closeBrowser()
 {
	 Reporter.log("Browser closed", true);
 }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
