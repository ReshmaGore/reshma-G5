package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();  // object of Chrome driver
		      
		      driver.manage().window().maximize();
		      
		   driver.get("https://www.discoveryplus.in/");
		          Thread.sleep(2000);
		          
		  driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		           Thread.sleep(2000);
		           
		  WebElement getOTP =driver.findElement(By.xpath("//button[text()='Get OTP']"));
		           System.out.println(getOTP.isEnabled());   // not get OTP 
		               getOTP.click();
		           Thread.sleep(1000);
		  driver.findElement(By.id("mobileNumber")).sendKeys("9960863581");
		           System.out.println(getOTP.isEnabled());   // not get OTP 
                       getOTP.click();   

	}

}
