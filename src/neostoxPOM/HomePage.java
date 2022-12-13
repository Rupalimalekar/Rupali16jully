package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class HomePage
{  @FindBy(xpath="(//a[text()='OK'])[2]")private WebElement okButton;
   @FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
    @FindBy(id="lbl_username")private WebElement userName;
	@FindBy(xpath="//span[text()='Logout']")private WebElement logoutButton;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	
	public HomePage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void handlePopUp(WebDriver driver) throws InterruptedException
	{
	if(okButton.isDisplayed())
	
	{
		Utility.wait(driver, 5000);
	  okButton.click();
	Reporter.log("Clicking on ok button",true);
	Utility.wait(driver, 5000);
	closeButton.click();
	Reporter.log("Clicking on close button of popup",true);
	//Utility.wait(driver, 4000);
	//	closeButton.click();
	}
	else
	{
		Reporter.log("there is no popup", true);
		Thread.sleep(3000);
	}
	}
	
	  public String getActualUserName(WebDriver driver) throws InterruptedException
	{
		 Utility.wait(driver, 6000);
		String actualUserName = userName.getText();	
		Reporter.log("Getting actual user name ",true);
	//	String realUserName = actualUserName.substring(3);
		Reporter.log("Getting real actual user name "+actualUserName,true);
		return actualUserName;

	}	
	  
	public void logoutFromNeoStox(WebDriver driver)
	{
		Utility.wait(driver,1000);
		userName.click();
		Utility.wait(driver, 1000);
		logoutButton.click();
		Reporter.log("Logging out from neoStox", true);	
	}
	  
	public String getBalance(WebDriver driver)
	{
		Utility.wait(driver, 1000);
        String actualBalance = balance.getText();
        Reporter.log("Getting actual baalance", true);
        return actualBalance;
	}
	  
	  
	  
	  
	  
}
