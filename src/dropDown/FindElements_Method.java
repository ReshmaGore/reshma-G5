package dropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	           WebDriver driver=new ChromeDriver();
	    
               driver.manage().window().maximize();
               
               driver.get("https://www.google.co.in/");
               
               // To find how many links are there in webpage?
               
                List<WebElement> links = driver.findElements(By.tagName("a"));
                
                 System.out.println(links.size());
                 
                 // what are these links?  by using for loop/for each loop/iterator/etc.
                 
                Iterator<WebElement> it = links.iterator();
                 
                while(it.hasNext())
                {
                	System.out.println(it.next().getText());
                }
                 
                 
                
                

	}

}
