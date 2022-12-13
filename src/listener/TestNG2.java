package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
	 @Test(priority = -1)
     public void D()
       {
	         Reporter.log("D method is running", true);
       }
    @Test
    public void E()
       {
	        Assert.fail();
	        Reporter.log("E method is running", true);
       }
    @Test(dependsOnMethods = "E")
    public void F()
       {
	        Reporter.log("F method is running", true);
       }

}
