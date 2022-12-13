package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse_Method4 {
  @Test
  public void testCase1() 
  {
	  boolean b=false;
	  Assert.assertFalse(b, "b is true TC is failed");
  }
}
