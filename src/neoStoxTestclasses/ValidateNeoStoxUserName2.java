package neoStoxTestclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBaseClass.BaseNew;
import neoStoxPOMclasses.NeoStoxHomePage;
import neoStoxPOMclasses.NeoStoxLoginPage;
import neoStoxPOMclasses.NeoStoxPasswordPage;
import neoStoxPOMclasses.NeoStoxSignInPage;
import neoStoxUtility.Utility;
import neoStoxUtility.UtilityNew;

@Listeners(neoStoxUtility.Listener.class)
public class ValidateNeoStoxUserName2 extends BaseNew
{
    NeoStoxLoginPage login;
    NeoStoxPasswordPage password;
    NeoStoxHomePage home;
    NeoStoxSignInPage signIn;

@BeforeClass

public void launchNeoStox() throws InterruptedException, IOException
  {
	launchBrowser();  //  comes from Base class
	login=new NeoStoxLoginPage(driver);
	password =new NeoStoxPasswordPage(driver);
	home=new NeoStoxHomePage(driver);
	signIn =new  NeoStoxSignInPage(driver);
  }

 @BeforeMethod

public void logintoNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
  { 
	signIn.clickOnSignInButton(driver);
	login.sendMobileNum(driver, UtilityNew.readDataFrompropertyFile("mobileNum"));
	login.clickOnSignInButton(driver);
	Utility.wait(driver,3000);
	password.enterPassword(driver, UtilityNew.readDataFrompropertyFile("password"));
	Thread.sleep(1000);
	password.clickOnSubmitButton(driver);
	Thread.sleep(1000);
	home.handlePopUp(driver);
  }
@Test(priority=1)
public void validateUserID() throws IOException
{
Assert.assertEquals(home.getActualUserName(driver), UtilityNew.readDataFrompropertyFile("userName"),"Actual and expected User name are not matching");

    
    UtilityNew.screenshot(driver, home.getActualUserName(driver));

}
@Test(priority=2)
public void validateAccBalance() throws IOException
{    
   Assert.assertNotNull(home.getAccBalance(driver), "TC is failed Unable to fetch account Balance");
  
   Assert.fail();
   //Utility.screenshot(driver, home.getAccBalance(driver));
}
@AfterMethod
public void logOutFromNeoStox()
{
	   home.logOut(driver);
}

@AfterClass

public void closeBrowser()
{
	   Reporter.log("closing Browser", true);
	   driver.close();
}


}
