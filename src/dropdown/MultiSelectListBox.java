package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	public static void main(String[] args) throws InterruptedException
	{ 
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		//1.
		WebElement multiSelectDropbox = driver.findElement(By.id("cars"));
		
		//2.
		Select s=new Select(multiSelectDropbox);
		
		//3.
		System.out.println("Multiple selectable status is "+s.isMultiple());
		
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		s.selectByValue("audi");
		
		Thread.sleep(1000);
		s.selectByIndex(1);
		
		//s.deselectAll()
		s.deselectByIndex(3);
		
		
		
		
		
		
		
		


	}

}
