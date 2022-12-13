package upStoxPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
           driver.get("https://login-v2.upstox.com/");
           Thread.sleep(2000);
            
 //Create object of loginpage
           
           UpStoxLoginPage page = new UpStoxLoginPage(driver);
           
           page.enterUserId();
           Thread.sleep(1000);
           page.enterPassword();
           page.clickSignInButton();
		
//create object of passcodepage
           Thread.sleep(5000);
           PasscodePage pp = new PasscodePage(driver);
		    pp.enterPasscode();
		
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//Create object of Welcome page
		    WelcomePage wp = new WelcomePage(driver);
		    		wp.clickOnIamGoodButton();
		    		
//Create object of home page
		   
		    HomePage hp = new HomePage(driver);		
		    hp.validateuserName();
		    hp.clickOnFunds();
		    	
	//	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//Create object of trade page
		    TradePage tp = new TradePage(driver);
		    tp.getTrade();	
		    		
		    		
		
	}

}
