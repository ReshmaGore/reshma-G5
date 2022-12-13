package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browsertest {
  @Test
  public void f() {
	  
System.setProperty("webdriver.gecko.driver", "D:\\16th_july_selenium\\geckodriver.exe");
	  
	 WebDriver driver=new FirefoxDriver();
	 
	 driver.get("https://vctcpune.com/");
  }
}
