package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage
{
   //variable declaration (globally)----No of elements=No of variables
	//1.Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(name="userId") private WebElement userID;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement signInButton;
	
	//2.Initialize within a constructor with access level public using page factory
	
	public UpStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//3.Utilize within a method with access level public
	
	public void enterUserId()
	{
		userID.sendKeys("4VB2TE");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Soma@7756");
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
