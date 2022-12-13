package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://www.facebook.com/");
          
       //  WebElement userName = driver.findElement(By.id("email"));
               
         //userName.sendKeys("hi hello");  
         
         Actions act=new Actions(driver);
         
        // act.moveToElement(userName).sendKeys("Good Evening").build().perform();
         
        // act.sendKeys(userName, "Good Night").perform();
              Thread.sleep(1000);
         WebElement creatNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
         
              act.click(creatNewAcc).perform();
                 Thread.sleep(1000); 
                 
                WebElement day = driver.findElement(By.id("day"));
                
                 act.click(day).perform(); 
                 
                 // how to handle drop down 
                 
              // act.sendKeys(Keys.ARROW_UP).perform();
               //       Thread.sleep(100);
              //   act.sendKeys(Keys.ARROW_UP).perform();
              //        Thread.sleep(100);
              //   act.sendKeys(Keys.ARROW_UP).perform();
               //       Thread.sleep(100);
               //  act.sendKeys(Keys.ENTER).perform(); 
    //==================================================================================================             
                 // by using for loop
                 
                 for(int i=0;i<=10;i++)
                 {
                	 act.sendKeys(Keys.ARROW_UP).perform();
                 }
                     act.sendKeys(Keys.ENTER).perform(); 
                    WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
                    
                    act.keyDown(firstName, Keys.SHIFT).sendKeys("Reshma").build().perform();
              
	           }

          }
