package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userName;
	@FindBy(id="funds")private WebElement funds;
	
//constructor
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//methods
	
	public void validateuserName()
	{
		String actualUN = userName.getText();
		String expectedUN = "Somnath M.";
		
	if(actualUN.equals(expectedUN))	
	{
		System.out.println("Username matching TC is Passed");
	}
	else
	{
		System.out.println("Username not macthing TC is failed");
	}
		
	}
	
	public void clickOnFunds()
	{
		funds.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
