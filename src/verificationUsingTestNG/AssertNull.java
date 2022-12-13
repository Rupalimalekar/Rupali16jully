package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void testing()
  {
	  
	  
	  String a="Hello";
	  
	  
	  Assert.assertNull(a,"a is not null TC is failed");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
