package testNG_XML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCases {
  @Test
  public void A() 
  {  // Assert.fail();
	  Reporter.log("A method is running", true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("B method is running", true);
  }
  @Test
  public void D() 
  {   Assert.fail();
	  Reporter.log("D method is running", true);
  }
  @Test
  public void E() 
  {
	  Reporter.log("E method is running", true);
  }
}
