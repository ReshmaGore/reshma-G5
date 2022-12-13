package upStox_POM_UsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement UserName;
  
	@FindBy(xpath="//a[text()='Funds']") private WebElement FundsButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserName()
	{
		String ActualUserName = UserName.getText();
		String ExpectedUserName="Reshma G.";
		
		if(ActualUserName.equals(ExpectedUserName))
		{
			System.out.println("ActualUserName is same as ExpectedUserName TC is passed");
		}
		else
		{
			System.out.println("ActualUserName is not same as ExpectedUserName TC is Failed");
		}
		
	}
	public void clickOnFundsButton()
	{
		FundsButton.click();
	}
	
}
