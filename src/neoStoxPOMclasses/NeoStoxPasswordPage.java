package neoStoxPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxPasswordPage 
{
	@FindBy(xpath="//input[@type='password']") private WebElement PasswordField;
	@FindBy(xpath="//a[text()='Submit']")private WebElement SubmitButton;
	
	
	
	public  NeoStoxPasswordPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(WebDriver driver,String password)
	{
		Utility.wait(driver, 1000);
		PasswordField.sendKeys(password);
		Reporter.log("entering password", true);
	}
	
	public void clickOnSubmitButton(WebDriver driver)
	{
		 Utility.wait(driver, 1000);
		 SubmitButton.click();
		Reporter.log("clicking on submit button", true);
	}

}
