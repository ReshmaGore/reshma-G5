package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_TestClass {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://login-v2.upstox.com/");
		 Thread.sleep(5000);
		 
	 // To create object of login page 
		 
		 UpStox_LoginPage login=new UpStox_LoginPage(driver);
		 
		 login.enterUserID();
		 
		 login.enterPassword();
		 login.clickSignInButton();
		 
	 //===============================================================================================
		 Thread.sleep(3000);
		 Upstox_PasscodePage passcode=new  Upstox_PasscodePage(driver);
		 
		 passcode.enterPasscode();
		 
	//==================================================================================================
		 Thread.sleep(5000);
		 Upstox_WelcomePage welcome=new Upstox_WelcomePage(driver);
		 
		 welcome.clickOnNoIAMGoodButton();
	//==============================================================================================
		 Thread.sleep(2000);
		 Upstox_HomePage home=new Upstox_HomePage(driver);
		 
		 home.validateUserIDName();
		 home.clickOnFundsButton();
	//=============================================================================================
		 Thread.sleep(1000);
		 Upstox_FundsPage fund=new Upstox_FundsPage(driver);
		 
		 fund.getMyFunds();
	//=============================================================================================
		 Thread.sleep(1000);
		 home.clickOnLogout();
		 
		 
	}

}
