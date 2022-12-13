package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals_method2 {
  @Test
  public void Test2() 
  {
	  String a="abc12";
	  String b="abc";
	  
	  Assert.assertNotEquals(a, b,"a and b are matching TC is failed");
  }
}
