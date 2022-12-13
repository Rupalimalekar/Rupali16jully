package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
//Variable declaration
	
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement noIamGoodbutton;

//constructor
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
//utilise
	
	public void clickOnIamGoodButton()
	{
		noIamGoodbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
