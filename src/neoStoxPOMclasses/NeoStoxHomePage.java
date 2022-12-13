package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxHomePage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement OKButton;
    @FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
    @FindBy(id="lbl_username") private WebElement userName;
    @FindBy(id="lbl_curbalancetop")private WebElement accountBalance;
    @FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
    


public NeoStoxHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void handlePopUp(WebDriver driver) throws InterruptedException
{ 
	if(OKButton.isDisplayed())
	{
	  Utility.wait(driver, 1000);
	  OKButton.click();
	  Reporter.log("clicking on OK button of Popup", true);
	  Utility.wait(driver, 1000);
	  closeButton.click();
	  Reporter.log("clicking on close button of Popup", true);
	}
	else
	{
		Reporter.log("There is no Popup", true);
		Thread.sleep(1000);
	}
}
public String  getActualUserName(WebDriver driver)
{
	Utility.wait(driver, 1000);
	String ActualUserName = userName.getText();
	Reporter.log("getting Actual user name", true);
	String realUserName = ActualUserName.substring(3);
	Reporter.log("actual user name is "+realUserName, true);
	return ActualUserName;
}
 public  String getAccBalance(WebDriver driver)
 {
	 Utility.wait(driver, 1000);
	String myBalance = accountBalance.getText();
	Reporter.log("geting account balance", true);
	Reporter.log("My account balance is "+myBalance, true);
	return myBalance;
	
 }
 public void logOut(WebDriver driver)
 {
	 Utility.wait(driver, 1000);
	 userName.click();
	 Utility.wait(driver, 1000);
	 	 logOutButton.click();
	 Reporter.log("Logging out ", true);
	 	 
 }
}
