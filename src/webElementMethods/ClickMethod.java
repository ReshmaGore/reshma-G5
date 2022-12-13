package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
      // 3) click method  ----> web element method
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\16th_july_selenium\\\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();  // create object of chrome
		  
		  driver.manage().window().maximize();
		  
		    driver.get("https://vctcpune.com/selenium/practice.html");
		           Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		           Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		           Thread.sleep(1000);
		    driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click(); 
		      // if we write this double then it will be clear check box i.e mark will be remove
		    
		  

	}

}
