package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage
{
	@FindBy(name="yob") private WebElement passcode;
	
	
//Constructor
	public UpStoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//methods
	

	

	public void enterPasscode(String passc)
	{
		passcode.sendKeys(passc);
	}
	
	
	
	
	
	
	
	
	
}
