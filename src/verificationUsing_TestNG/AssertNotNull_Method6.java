package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull_Method6 {
  @Test
  public void testCase1()
  {
	  String b="hii";
	  Assert.assertNotNull(b, "b is null TC is Failed");
  }
}
