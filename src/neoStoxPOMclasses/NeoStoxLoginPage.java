package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxLoginPage
{
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement MobileNoField;
	@FindBy(xpath="(//a[text()='Sign In'])[2]") private WebElement SignInButton;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendMobileNum(WebDriver driver,String mobNum)
	{    Utility.wait(driver, 1000);
		MobileNoField.sendKeys(mobNum);
		Reporter.log("Entering mobile number", true);
	}
	
	public void clickOnSignInButton(WebDriver driver)
	{    Utility.wait(driver, 1000);
		SignInButton.click();
		Reporter.log("clicking on sign in button", true);
	}

}
