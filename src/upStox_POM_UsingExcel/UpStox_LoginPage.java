package upStox_POM_UsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStox_LoginPage {
	
	@FindBy(name = "userId")private WebElement userID;
	@FindBy(name = "password")private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']")private WebElement SignInButton;
	
	//=======================================================================
	
	public UpStox_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	// usage 
	public void enter_userName(String un)
	{
		userID.sendKeys(un);
	}
	
	public void passwordFeild(String pwd) throws InterruptedException
	{  Thread.sleep(1000);
	
		password.sendKeys(pwd);
	}
	
	public void clickOnSignInButton()
	{
		SignInButton.click();
	}

}
