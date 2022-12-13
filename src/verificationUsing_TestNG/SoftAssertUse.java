package verificationUsing_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void testing()
  {
	  String a="abc";
	  String b="abc";
	  
	  // if a and b are not same and b is null then TC is pass
	  
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a,b, "a and b are same TC is failed");
	  soft.assertNull(b, "b is null TC is failed");
	  
	  soft.assertAll();
  }
}
