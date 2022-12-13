package neoStoxBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
  {
	   protected  WebDriver driver;
	    
	public void launchBrowser() throws InterruptedException
	   {
		
          System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		      driver=new ChromeDriver();
		
		      driver.manage().window().maximize();
		
		      driver.get("https://neostox.com/");
		        	Thread.sleep(1000);
		
	    }
}
