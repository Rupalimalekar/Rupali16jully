package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut=300)
  public void C() throws InterruptedException
  {
	  Thread.sleep(400);
	  Reporter.log("Method C is running", true);
  }
  
  @Test
  public void E() throws InterruptedException
  {Thread.sleep(200);
	  Reporter.log("Method E is running", true);
  }

  @Test
  public void D()
  {
	  Reporter.log("Method D is running", true);
  }


  
@Test(dependsOnMethods= {"D","C"})
public void A()
{
	  Reporter.log("Method A is running", true);
}

  
@Test
public void B()
{
	  Reporter.log("Method B is running", true);
}


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
