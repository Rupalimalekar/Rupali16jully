package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TradePage
{
  @FindBy(xpath="(//div[@class='_2Bthrplw1VYHfLzzQv0asZ']//div)[3]")private WebElement trade;
	
	 
  public TradePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
	
	public void getTrade()
	{
		trade.getText();
	}
	
	
	
	
	
}
