package verificationUsing_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_Method3 {
  @Test
  public void TestCase1() 
  {
	  boolean a=true;
	  Assert.assertTrue(a, "a is false TCis Failed");
	  
	//  boolean b=false;
	//  Assert.assertTrue(b, "b is false TC is Failed");
  }
}
