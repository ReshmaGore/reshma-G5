package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_WelcomePage {
	
	// declare global variable
	
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement NoIAmGoodButton;
	
	// initialize within  a constructor with access  level public using page factory
	
	public Upstox_WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// method
	
	public void clickOnNoIAMGoodButton() throws InterruptedException
	{ Thread.sleep(1000);
		NoIAmGoodButton.click();
	}

}
