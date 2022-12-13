package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority=5)
  public void D() 
  {
	  Reporter.log("D method is running", true);
  }
  
  @Test(priority=0,enabled=false)
  public void C() 
  {
	  Reporter.log("c method is running", true);

  }

  
  @Test(priority=2,invocationCount=2)
  public void B() 
  {
	  Reporter.log("B method is running", true);

  }
 
  @Test(priority=3)
  public void A() 
  {
	  Reporter.log("A method is running", true);

  }
 
  @Test(enabled=false)
  public void E() 
  {
	  Reporter.log("A method is running", true);

  }

  
  
  
  
  
  
  
  
  
  
  
  
  
}
