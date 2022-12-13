package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      //  driver.navigate.refresh();
		String myURL = driver.getCurrentUrl();
		System.out.println(myURL);
		String myTittle = driver.getTitle();
		System.out.println(myTittle);
		String myText = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(myText);
		
		
		
		
		
	}

}
