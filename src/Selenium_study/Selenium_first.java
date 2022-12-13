package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_first {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	 	WebDriver driver=new ChromeDriver();   // created object of ChromeDriver
		// 1) get method---> use-To enter url in browser to open an application
	 	
		  driver.get("https://paytm.com/");
		  
		// 2) close method----->use To close the current tab of the browser opened by Selenium tool.
		   
		//   driver.close();
		 
		// 3) quit method ---->To close the all tabs present on browser opened by Selenium tool.
		   
		//   driver.quit();
		   
	 System.out.println("============================================================");
		// 4) maximize method----> if i want to maximize the page 
	 
	     driver.manage().window().maximize();  
	 
	    // 5) minimize method --->if i want to minimize the page
	     
	     driver.manage().window().minimize();
	     
	     
	 
	 
       
	}

}
