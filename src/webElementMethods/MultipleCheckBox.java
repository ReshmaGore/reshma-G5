package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
    driver.manage().window().maximize();
	    
       driver.get("https://www.facebook.com/");
         Thread.sleep(1000);
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
         Thread.sleep(1000);
         //===========================================================
                   WebElement day1 = driver.findElement(By.id("day"));
                       day1.click();
                       Select Day=new Select(day1);
                       Day.selectByValue("3");
           //========================================================
             WebElement Month=driver.findElement(By.id("month")); 
                     
             Select month=new Select(Month);
             month.selectByIndex(5);
             
             
    
	}

}
