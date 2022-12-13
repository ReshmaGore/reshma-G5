package popUps_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click(); // it will show alert Pop-up 
            Thread.sleep(10000);
            // step1--> we need to Selenium focus from main page to alert popup
            
           Alert alt = driver.switchTo().alert();
           
           alt.accept();  // clicking on ok button
           
          String Mytext = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
          
          System.out.println("Head text is "+Mytext);
	}

}
