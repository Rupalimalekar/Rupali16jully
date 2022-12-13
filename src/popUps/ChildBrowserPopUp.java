package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
             driver.get("https://skpatro.github.io/demo/links/");
             
             String idOfMainPage = driver.getWindowHandle();
     System.out.println("Id of main page "+idOfMainPage);
		
//clicking on NewWindow----->Will open new child browser
		driver.findElement(By.name("NewWindow")).click();
		
//Get id of all window
		
		Set<String> idOfAllPages = driver.getWindowHandles();
		System.out.println(idOfAllPages);
		
		Iterator<String> it = idOfAllPages.iterator();
		String mainPageId = it.next();
		String idOfChildPage = it.next();
		
		//we need to switch focus child page
		
		driver.switchTo().window(idOfChildPage); //focus wil be change from main page to child page
		driver.manage().window().maximize();
		
		//current focus is on child page we will take action on it
		
//		driver.findElement(By.id(idOfChildPage)).sendKeys("GoodEven");
		Thread.sleep(5000);
		
//If we want to take action on main page then we need to chane focus from child to main page
		
		driver.switchTo().window(mainPageId);
		String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		
		System.out.println("My string is "+myText);
		
		
		
		
		
		
		
		
	}

}
