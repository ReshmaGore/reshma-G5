package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTitleAnd_GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://kite.zerodha.com/");
		     Thread.sleep(1000);
		  System.out.println("==============================================");
		   // 6)  getTitle() method
		  
		     driver.getTitle();
		  System.out.println(driver.getTitle());    // use
		     
		             String myTitle= driver.getTitle();   // store 
		     System.out.println("Title of web page is "+myTitle);
		  System.out.println("=============================================================");
		   // 7) getCurrentUrl() method
		  
		      driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
		    
		   String myUrl=driver.getCurrentUrl();
		   System.out.println("my current Url is "+myUrl);
		   System.out.println("============================================================");
		  
		  
		   

	}

}
