package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage
{
	
	//1. variable declaration
	
	@FindBy(name="yob")private WebElement passc;
	
	//2.initialize within constructor with access public using page factory
	
      public PasscodePage(WebDriver driver)	
      {
    	  PageFactory.initElements (driver,this);
      }
	
//3.Utilize within method
      
     public void enterPasscode()
     {
    	 passc.sendKeys("2001");
     }
      
      
      
      
      
      
}
