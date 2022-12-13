package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://demoqa.com/buttons");
                Thread.sleep(3000);
    // Mouse actions---> 1)click 2)Double click 3)move to element 4) Drag and Drop 5) context click( for right click)
              
          // Step 1---> to create object of actions class and pass driver  as a argument 
          
                       Actions act=new Actions(driver);
                         Thread.sleep(3000);
                         //1) click() method
          // Step 2---> by using one of the actions class methods perform required actions 
            WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
                         
                    // act.click(clickMe).perform();
                       
                act.moveToElement(clickMe).click().perform();
                       Thread.sleep(3000);
                     // 2)Double click
                       
                    WebElement Doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
                       
                      act.moveToElement(Doubleclick).doubleClick().build().perform();
                       
                //3) context click
                      
                  WebElement rightclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
            
                     act.moveToElement(rightclick).contextClick().build().perform();
                     
	}

}
