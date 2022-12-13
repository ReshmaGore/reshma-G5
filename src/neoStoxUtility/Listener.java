package neoStoxUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBaseClass.BaseNew;

public class Listener extends BaseNew implements ITestListener
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
		String TCName = result.getName();
		Reporter.log("TC "+TCName+ " is failed please try again...", true);
		
		try {
			UtilityNew.screenshot(driver, TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }


}
