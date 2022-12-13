package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class TableEg1 {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://vctcpune.com/selenium/practice.html");
     //  Actions act = new Actions(driver);
   //How many rows in table
       
     List<WebElement> totalRows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		System.out.println("Total no. of rows "+totalRows.size());
	
//How many coloumns in table
		List<WebElement> totalColoumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		System.out.println("Total no.of coloumns "+totalColoumns.size());
		
//how to read specific data
		
		WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", table);
	
		String myText = driver.findElement(By.xpath("((//table[@id='product']//tr)[7]//td)[2]")).getText();
		System.out.println(myText);
		
		
		
		
		
		
	}

}
