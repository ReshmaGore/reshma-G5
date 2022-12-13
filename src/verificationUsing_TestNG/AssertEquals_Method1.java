package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals_Method1 {
  @Test
  public void test1() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	  // if actual is same(equal)as expected then test case pass otherwise fail
	  Assert.assertEquals(a, b,"a and b are not  matching TC is failed");
  }
}
