package serial_Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void google()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.google.co.in/");
	  
  }
}
