package dynamicElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://www.google.co.in/");
          
          driver.findElement(By.name("q")).sendKeys("iphone 14");
                Thread.sleep(1000);
          driver.findElement(By.xpath("(//span[text()='iphone 14'])[1]")).click();
                Thread.sleep(1000); 
             driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[4]")).click(); 
                Thread.sleep(1000); 
           driver.findElements(By.tagName("img"));
                Thread.sleep(1000);
            List<WebElement> results = driver.findElements(By.tagName("img"));
               System.out.println(results.size());
               Thread.sleep(1000);
           Iterator<WebElement> img = results.iterator();
              
                 while(img.hasNext())
                 {
                	 System.out.println(img.next().getText());
                 }
               
	}           
	

}
