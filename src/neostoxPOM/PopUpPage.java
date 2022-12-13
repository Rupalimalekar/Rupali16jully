package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpPage 
{
	@FindBy(xpath="(//span[text()='×'])[19]")private WebElement closeMark;
	
	public PopUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCrossMark()
	{
		closeMark.click();
	}
	
	
	
	
	

}
