package scrollingByActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ScrollingEg1 {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
           
//Creating object of Action Class	
		
            Actions act = new Actions(driver);
         
//Scrolling By using Action class		
	     //	act.scrollByAmount(0, 500).perform();
		
		
//scrollInto View By using Action Class
	    	WebElement myText = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
	        act.scrollToElement(myText).perform();
		    System.out.println(myText.getText());
		
		
//Sendkeys using javascriptExecutor
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement clickOnRadioButton = driver.findElement(By.name("radio"));
    		js.executeScript("arguments[0].click();",clickOnRadioButton);
		
		
//Click using javascriptExecutor		
	    	//WebElement useSendkeysJS = driver.findElement(By.id("autocomplete"));
	   //	js.executeScript("arguments[0].value='Rupali'", useSendkeysJS);
		
	}

}
