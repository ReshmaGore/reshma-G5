package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_Method5 {
  @Test
  public void testCase1() 
  {
	  String a =null;
	  Assert.assertNull(a, "a is not null TC is failed");
  }
}
