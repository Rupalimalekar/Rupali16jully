package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage
{
@FindBy(name="userId") private WebElement userID;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//2.Initialize within a constructor with access level public using page factory
	
	public UpStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
public void enterUserID(String un)
{
	userID.sendKeys(un);
}

public void enterPassward(String pwd)
{
	password.sendKeys(pwd);
}
	
public void clickOnSignInButton()
{
	signInButton.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
