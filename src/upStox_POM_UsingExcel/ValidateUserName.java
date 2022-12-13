package upStox_POM_UsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

   public class ValidateUserName {
 
		
	            WebDriver driver;
	            UpStox_LoginPage login;
	            Upstox_PasscodePage passcode;
	      //    Ups
	            
	           
			 
	@BeforeClass
	public void launchBrowser() throws InterruptedException
		{
			 System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
					
				   driver=new ChromeDriver();
				   
			 driver.manage().window().maximize();
			 driver.get("https://login-v2.upstox.com/");
				   Thread.sleep(1000);
		}
	@BeforeMethod
	public void loginToUpstox()
			{
				
			}
			
	 @Test
	 public void validateUserName() 
		   {
			 
		   }
	 @AfterMethod
	  public void logOutFromUpstox()
	  {
		  
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
	  
	  
	  
	  
	}
  }

