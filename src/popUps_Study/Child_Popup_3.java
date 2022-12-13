package popUps_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Popup_3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
           
		String mainPageID = driver.getWindowHandle();
		
		System.out.println(mainPageID);
		// clicking on new window button---> will open new child browser
		  driver.findElement(By.name("NewWindow")).click();
		Set<String> allPageIDs = driver.getWindowHandles();
		
		//print all IDs
		System.out.println("All IDs are "+allPageIDs);
		
		Iterator<String> it = allPageIDs.iterator();
		
		// getting all IDs of pages
		
		         String idOfMainPage = it.next();
		        String idOfChildPage = it.next();
		
		// we need to switch to child page
		        
		        driver.switchTo().window(idOfChildPage); //my focus on main page to child page
		        
		        driver.manage().window().maximize();
		        
		        // driver.close();
		        // driver.quit();
		        
		        // current focus is on child page--> now we can perform actions on child page
		        
		        driver.findElement(By.id("the7-search")).sendKeys("good morning");
		        
		        Thread.sleep(1000);
		        // now if we want to perform actions on main page need to switch focus from child page to main
		        
		        driver.switchTo().window(idOfMainPage);
		        
		      String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		      
		      System.out.println("Main page text is "+myText);
		        
		
		
	}

}
