package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
  @Test
  public void validateUpStoxUserID() 
  {
	  Reporter.log("User ID validated", true);
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	 Reporter.log("Launching Browser", true); 
  }
  
  @BeforeMethod
  public void loginUpstox()
  {
	  Reporter.log("Login Success...", true);
  }
  
  @AfterMethod
  public void logOutFromUpstox()
  {
	  Reporter.log("Logout succesfull", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("closing browser", true);
  }
  
}
