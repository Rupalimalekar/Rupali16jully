package testNG;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() 
  {
	  Reporter.log("Method f", true);
 
  }
  
  @Test
  public void f1()
  {
    Reporter.log("Method f1", true);
  
  }
  
  
  
  
  
}
