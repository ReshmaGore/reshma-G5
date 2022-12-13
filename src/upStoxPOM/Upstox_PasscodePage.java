package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_PasscodePage {
	
	//variable declaration(globally)------>no.of element=no.of variable
	
		// 1) data member should be declared globally with access level private using @findBy Annotation
     @FindBy(id = "yob") private WebElement Passcode;
     
     // Initialize within a constructor with access public by using pageFactory
     
     public Upstox_PasscodePage (WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
  // Utilize within a method with access level public
     
     public void enterPasscode()
     {
    	 Passcode.sendKeys("1993");
     }
     

}
