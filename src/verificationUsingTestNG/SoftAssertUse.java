package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
	
	     SoftAssert soft = new SoftAssert();  //Created object of soft assert
	
  @Test
  public void testing()
  {
	  
//If a and b are not equal and b is null then TC is passed
	  
	     String a="abc";
	     String b=null;
	     
	     soft.assertNotEquals(a,b,"a and b are equals TC is failed");
	     soft.assertNull(b,"b is not TC is failed");
	           soft.assertAll();
	  
	  
  }
  
 @Test
 public void testing1()
 {
	soft.fail();
	soft.assertAll();
	 
	 
 }
  
  
  
  
}
