package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // object of chrome driver
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://kite.zerodha.com/");
		  Thread.sleep(1000);
		
	    driver.navigate().to("https://www.facebook.com/");
	    	Thread.sleep(1000);
		
            driver.navigate().back();
            Thread.sleep(1000);
        
        driver.navigate().forward();
           Thread.sleep(1000);
        driver.navigate().refresh();
	}

}
