package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CB_Testing {
	WebDriver driver;
@Parameters("browserName")
  @Test
  public void browserTesting(String bname) 
  {
		 if(bname.equals("firefox"))
		 {
	  System.setProperty("webdriver.gecko.driver", "D:\\16th_july_selenium\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
	  
		 }
		 else if(bname.equals("chrome"))
    {  
	  System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  
	
  }
		 driver.get("https://vctcpune.com/");
}
}