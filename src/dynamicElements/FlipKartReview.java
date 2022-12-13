package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartReview {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://www.flipkart.com/");
          
          driver.findElement(By.xpath("//button[text()='✕']")).click();
            Thread.sleep(1000);
            driver.findElement(By.name("q")).sendKeys("i phone 14 pro max");
            
            driver.findElement(By.xpath("//button[@type='submit']")).click();
                       Thread.sleep(1000);
          String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
           
           System.out.println("Todays review are "+review);

	}

}
