package upStox_POM_UsingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upstox_testClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		
		Thread.sleep(1000);
//========================================================================
		  File MyFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String userid = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		
		 // create an object of UpStox_LoginPage
		
		UpStox_LoginPage login =new UpStox_LoginPage(driver); // object of login page 
		
		 login.enter_userName(userid);
		Thread.sleep(5000);
		
		 login.passwordFeild(password);
	// or login.passwordFeild(mySheet.getRow(0).getCell(1).getStringCellValue());
		 login.clickOnSignInButton();
//============================================================================
		Upstox_PasscodePage passcode =new Upstox_PasscodePage(driver);
		      Thread.sleep(5000);
		 passcode.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
		 
//======================================================================================
		 // Create object of Welcome page
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 Welcome_Page page=new  Welcome_Page(driver);
		 	 page.clickOnIAmGoodButton();
 //===========================================================================
		 	 
		 	 // Create object of Home Page
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 	 HomePage home=new  HomePage(driver);
		 	 
		 	 home.validateUserName();
		 	 home.clickOnFundsButton();
		 	 
		 
		

	}

}
