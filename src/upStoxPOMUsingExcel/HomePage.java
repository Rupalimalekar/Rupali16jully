package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userName;
	@FindBy(id="funds")private WebElement fundsButton;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getUsername()
	{
		String actualuserName = userName.getText();
		String expecteduserName = "Somnath M.";
		if(actualuserName.equalsIgnoreCase(expecteduserName))
		{
			System.out.println("TC is pass");
			
		}
		else
		{
			System.out.println("TC is fail");
		}
		
		
	}
	
	public void clickOnFunds()
	{
		fundsButton.click();
	}
	
	

}
