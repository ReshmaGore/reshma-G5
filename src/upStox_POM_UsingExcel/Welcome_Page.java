package upStox_POM_UsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page 
{
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement noIAmGoodButton;

 public Welcome_Page (WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
  public void clickOnIAmGoodButton()
  {
	  noIAmGoodButton.click();
  }
}
