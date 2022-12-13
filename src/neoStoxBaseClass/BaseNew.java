package neoStoxBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxUtility.UtilityNew;

public class BaseNew
   {
	            protected static WebDriver driver;
	    
		public void launchBrowser() throws InterruptedException, IOException
		   {
	          System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
			 driver.manage().window().maximize();
			
			 driver.get(UtilityNew.readDataFrompropertyFile("url"));
				Thread.sleep(1000);
				
		   }

  }
