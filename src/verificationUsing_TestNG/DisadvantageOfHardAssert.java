package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisadvantageOfHardAssert {
  @Test
  public void testing()
  {
	  String a="Pune";
	  String b="Mumbai";
	  // a and b should be different and b should not be null then TC pass
	  // and if both are same string then shows test case fail
	  
	  Assert.assertNotEquals(a, b, "a and b are same(equal) TC is failed");
	  Assert.assertNotNull(b, "b is null TC is failed");
	  
  }
}
