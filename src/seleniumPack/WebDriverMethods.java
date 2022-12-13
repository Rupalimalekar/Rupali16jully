package seleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException
	{

	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
        
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.intstagram.com/");
        Thread.sleep(2000);
        
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
 
	//	driver.navigate().back();
      //  Thread.sleep(1000);

	//	driver.navigate().forward();
      //  Thread.sleep(1000);
      
   //     driver.navigate().refresh();
     //   driver.manage().window().minimize();
        

    String TITLE  = driver.getTitle();
     System.out.println( driver.getTitle());
     System.out.println(TITLE);
     System.out.println("Title of webpage is"+TITLE);
    String myUrl = driver.getCurrentUrl();
     System.out.println("My current Url is"+myUrl);
     
     
     
     
       
       
	}

}
