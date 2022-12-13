package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	
   @Override
   public void onTestSuccess(ITestResult result) 
      {
		Reporter.log("TC "+result.getName()+ " is passed...", true);
	  }

	@Override
	public void onTestSkipped(ITestResult result) 
	  {
		Reporter.log("TC "+result.getName()+ " is Skipped please try again...", true);
	  }

	
	@Override
	public void onTestFailure(ITestResult result)
	  {
		Reporter.log("TC "+result.getName()+ " is failed please try again...", true);
	  }


}
