package upstox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		    WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://login-v2.upstox.com/");
		   Thread.sleep(1000);
           driver.findElement(By.name("userId")).sendKeys("6WB34C");
           
           driver.findElement(By.name("password")).sendKeys("Reshma@123");
         
           driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
           Thread.sleep(3000);
           driver.findElement(By.id("yob")).sendKeys("1993");
           Thread.sleep(7000);
           driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
           Thread.sleep(1000);
           
    String actualUserName = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
    
       String expectedUserName = "Reshma G.";
        //To validate expected and actual
       
       if(actualUserName.equals(expectedUserName))
       {
    	   System.out.println("Username matching TC is Passed");
       }
       else
       {
    	   System.out.println("Username not mathching TC is Failed");
       }
       
       System.out.println("=================================================================");
       
       // To check Funds
       
       driver.findElement(By.id("funds")).click();
       Thread.sleep(1000);
       
     String myFund = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
     
     System.out.println("Fund Available to trade is "+myFund);
       
	}

}
