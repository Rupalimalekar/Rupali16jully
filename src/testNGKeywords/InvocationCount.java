package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  public void myMethod1()
  {
	  Reporter.log("My method 1 is running", true);
  }
  
  
  @Test(invocationCount=2)
  public void myMethod2()
  {
	  Reporter.log("My method 2 is running", true);
  }

  
  @Test
  public void myMethod3()
  {
	  Reporter.log("My method 3 is running", true);
  }
 
  
  
  
  
  
  
}
