package testNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTesting1 {
  @Test(groups="funds")
  public void A() 
  {
	  Reporter.log("A method is running", true);
  }
  
  @Test(groups="un")
  public void B() 
  {
	  Reporter.log("B method is running", true);
  }
  @Test(groups="un")
  public void C() 
  {
	  Reporter.log("C method is running", true);
  }
  
  @Test
  public void D() 
  {
	  Reporter.log("D method is running", true);
  }
  
}
