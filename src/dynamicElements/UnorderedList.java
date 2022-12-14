package dynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://www.google.co.in/");
          
          driver.findElement(By.name("q")).sendKeys("honda");
          
            Thread.sleep(1000);
            
           List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1] / li"));
            
             System.out.println("no. of options------> "+results.size());
             
             for(WebElement r:results)
             {
            	 System.out.println(r.getText());
             }
          

	}

}
