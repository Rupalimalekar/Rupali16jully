package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAssert {
  @Test
  public void testing()
  {
	  
	  String a="Pune";
	  String b=null;
	  
//if both are not equal and b is not null then TC should be pass
	  Assert.assertNotEquals(b, a,"a and b are equal TC is failed");
	  Assert.assertNotNull(b,"b is null TC is failed");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
