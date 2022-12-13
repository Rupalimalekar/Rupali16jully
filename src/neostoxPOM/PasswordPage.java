package neostoxPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class PasswordPage 
{
	@FindBy(id="txt_accesspin")private WebElement passwordField;
	
	@FindBy(id="lnk_submitaccesspin")private WebElement submitButton;
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPassword( WebDriver driver ,String pass)
	{
		Utility.wait(driver, 1000);
		passwordField.sendKeys("2782");
		Reporter.log("Entering password", true);
	}
	
	public void clickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(700);
		submitButton.click();
		Reporter.log("Clicking on submit button",true);
	}
	
	
	
	
	

}
