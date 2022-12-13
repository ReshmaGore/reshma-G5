package verificationUsing_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void verifyCheckBoxStatus()
  {
		
	  System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
	  		
	  		WebDriver driver=new ChromeDriver(); // object of chrome driver
	  		
	  		driver.manage().window().maximize();
	  	
	  		driver.get("https://vctcpune.com/selenium/practice.html");
	  		
	  		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
	  		
	  		if( checkBox1.isSelected())
	  		{
	  			Reporter.log("checkBox 1 is selected TC is passed", true);
	  		}
	  		else
	  		{
	  			Reporter.log("check Box 1 is not selected TC is failed" , true);
	  		}
	  		
  }
}
