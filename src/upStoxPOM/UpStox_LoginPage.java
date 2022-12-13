package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStox_LoginPage {
	
	//variable declaration(globally)------>no.of element=no.of variable
	
	// 1) data member should be declared globally with access level private using @findBy Annotation

    @FindBy(name = "userId") private WebElement userID;
    
    @FindBy(name ="password")  private WebElement password;
    
    @FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement SignInButton;
    
    // Initialize within a constructor with access public by using pageFactory
    
    public UpStox_LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    // Utilize within a method with access level public
    
    public void enterUserID()
    {
    	userID.sendKeys("6WB34C");
    }
    
    public void enterPassword() throws InterruptedException
    { Thread.sleep(1000);
    	password.sendKeys("Reshma@123");
    	
    }
    
    public void clickSignInButton()
    {
    	SignInButton.click();
    }
    
    
    
    

}
