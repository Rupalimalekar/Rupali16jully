package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		
		System.out.println(checkbox.isSelected());
		
		checkbox.click();
		System.out.println(checkbox.isSelected());
		

	}

}
