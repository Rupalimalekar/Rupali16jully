package dropdown;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
       
       Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rupali");
	
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Malekar");
 //=======================================================================================      
       
       Thread.sleep(2000);
       
		WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
	
       Select day =new Select(days);
		day.selectByIndex(8);	
//===================================================================================================
		Thread.sleep(2000);
		WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
           Select month = new Select(months);		
		month.selectByVisibleText("Apr");
//====================================================================================================
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select years = new Select(year);
		  years.selectByValue("1999");
//===================================================================================
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@id='u_2_2_4t']")).click();
//*****************************************************************************************************
		  Thread.sleep(2000);
		  System.out.println("============================================");
//For days		  
		 List<WebElement> date = day.getOptions();
		 
		 System.out.println(date.size());
		 
		 for(WebElement d:date)
		 {
			 System.out.println(d.getText());
			 
		 }
		 Thread.sleep(2000);
//*****************************************************************************************************		 
		 System.out.println("==================================");
		 //For months
		List<WebElement> m = month.getOptions();
		System.out.println(m.size());
	
     Iterator<WebElement> it = m.iterator();
		 
			while(it.hasNext())
			{
				System.out.println(it.next().getText());
			}
			Thread.sleep(2000);
//***********************************************************************************************
			System.out.println("=================================================");
//For Year
			List<WebElement> ye = years.getOptions();
			System.out.println(ye.size());
		 Iterator<WebElement> ity = ye.iterator();
		 
		 while(ity.hasNext())
		 {
			 System.out.println(ity.next().getText());
		 }

	}

}
