package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Keys {
   // we cover 1) SendKeys() method and 2) clear() method
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\16th_july_selenium\\\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();  // create object of chrome
		  
		  driver.manage().window().maximize();
		  
//  1) get() method ----> to enter url in browser or to open an application
		  
		  // Example no.1)
		  
		            driver.get("https://vctcpune.cm/selenium/practice.html");
		  
		  driver.findElement(By.xpath("// input[@id='name']")).sendKeys("Hi how are you");
		  
		         Thread.sleep(1000);
		  
		   driver.findElement(By.xpath("// input[@id='name']")).clear();
		          
		          Thread.sleep(500);
		   
		   driver.findElement(By.xpath("// input[@id='name']")).sendKeys("Velocity Pune");
//==================================================================================================//	   
		  //  Example no.2)
		   
		           driver.get("https://www.facebook.com/");
		   
	//	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Velocity@pune.com");
	//	           Thread.sleep(1000);
		           
	//	   driver.findElement(By.xpath("// input[@id='name']")).clear();
      
	//	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pune Univercity");
	//	           Thread.sleep(1000);
 //===========================================================================================//
                // instead of ex.2) we can write it in short by following way
		           
	   WebElement emailFeild = driver.findElement(By.xpath("//input[@id='email']"));  // object creation of findElement
		           
	                 emailFeild.sendKeys("Reshma Gore");   // sendKeys method
	                     Thread.sleep(1000);
	                 emailFeild.clear();          // clear method
	                     Thread.sleep(1000);
	                 emailFeild.sendKeys("Seema Gore");
	                 
	}

}
