package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage1
{
   @FindBy(xpath="//div[text()='No, I’m good']")private WebElement noIamGoodButton;
	
	
	public WelComePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnButton()
	{
		noIamGoodButton.click();
	}
	
	
	
	
	
}
