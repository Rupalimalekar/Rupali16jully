package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOfPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
           driver.manage().window().maximize();
           
           driver.get("https://vctcpune.com/");
           
           String mainPgeId = driver.getWindowHandle();
           System.out.println("Main page id "+mainPgeId);
           
 //Clicking on start selenium practice------>will open new child browser
           Thread.sleep(2000);
           driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
           
//Get id of all window
           
           Set<String> idOfAllPage = driver.getWindowHandles();
           System.out.println(idOfAllPage);
           
// Traversing
           Iterator<String> it = idOfAllPage.iterator();
           String idOfMainPage = it.next();
           String idOfChildPage = it.next();
           
//We need to switch focus from main page to child browser to get the text
           driver.switchTo().window(idOfChildPage);
           String myText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
           System.out.println("Child browser text is "+myText);
           driver.close();
           
//Change the focus from child browser to main browser
           Thread.sleep(2000);
           driver.switchTo().window(idOfMainPage);
		   String text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class ')]")).getText();
		   System.out.println("Main Page Text is "+text);
		   driver.close();
		
		
		
		
		
		
	}

}
