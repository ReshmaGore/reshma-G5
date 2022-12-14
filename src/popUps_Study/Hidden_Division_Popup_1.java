package popUps_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup_1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://www.flipkart.com/");
          
          driver.findElement(By.xpath("//button[text()='✕']")).click();
          
          driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
          
          driver.findElement(By.xpath("//button[@type='submit']")).click();         

	}

}
