package actionsClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
         // driver.get("https:demo.guru99.com/test/drag_drop.html");
          driver.get("https://demoqa.com/buttons");
           Thread.sleep(2000);
          
           Actions act=new Actions(driver);  // 1. to create object of Actions class & pass driver object as a parameter
           
          WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
                                             // 2. by using one of the Actions class methods perform required actions
          
            act.contextClick(rightclick).perform();
                Thread.sleep(2000);
        //=======================================================================================
            WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
          
            act.doubleClick(doubleclick).perform();
               Thread.sleep(2000);
               
               driver.close();

	}

}
