package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_HomePage {
	
	// global variable 
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	
	@FindBy(id = "funds") private WebElement Funds;
	
	@FindBy(xpath = "//div[text()='Logout']")private WebElement logoutButton;
	
	// initialize within constructor
	
	public Upstox_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// method
	
	public void validateUserIDName()
	{
		String actualUserID = userID.getText();
		String expectedUserID = "Reshma G.";
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("Actual and expected userID is matching TC is pass");
		}
		else
		{
			System.out.println("Actual and expected userID is not  matching TC is Failed");
		}
	}
	
	public void clickOnFundsButton()
	{
		Funds.click();
	}
	
	public void clickOnLogout() throws InterruptedException
	{    userID.click();
	     Thread.sleep(1000);
	     
		logoutButton.click();
		
	}

}
