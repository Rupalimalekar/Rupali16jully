package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void testing()
  {
	  String a="abc";
	  String b="abc1";
	  
	  Assert.assertNotEquals(a, b,"a and b are same TC is failed");
	  
	  
  }
}
