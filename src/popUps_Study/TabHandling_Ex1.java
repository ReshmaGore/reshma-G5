package popUps_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling_Ex1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://vctcpune.com/");
          driver.findElement(By.linkText("Start Selenium Practice")).click();
          // to switch in new tab we need window ids
          // to get window ids --> use method getWindowHandles();
          
         Set<String> tabs = driver.getWindowHandles();
         
         Iterator<String> it = tabs.iterator();
         
         String idOfMainPage = it.next();
         String idOfNewTab = it.next();
         
         // we need to switch focus from main page to new tab
         
         driver.switchTo().window(idOfNewTab);
       String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
       
       System.out.println("New tab text is "+text);
       
       driver.close();
       
       // now we need to switch focus from new tab to main page
       
       driver.switchTo().window(idOfMainPage);
       
      String mainPageText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity ')]")).getText();
       
       System.out.println(mainPageText);
          

	}

}
