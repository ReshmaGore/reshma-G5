package testNGStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NormalClass {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
      WebDriver driver=new ChromeDriver();

      driver.manage().window().maximize();
      
      driver.get("https://www.google.co.in/");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void f1() {
	 
  System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(); // object of chrome driver
	
//	driver.manage().window().maximize();

	driver.get("https://vctcpune.com/selenium/practice.html");
  }
	
}
