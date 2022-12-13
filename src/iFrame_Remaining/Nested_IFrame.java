package iFrame_Remaining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_IFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();  // object of Chrome driver
	      
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/nestedframes");
	  //    WebElement mainPagrElement=driver.findElements(By.xpath("//div[text()="));
	      //  System.out.println("main page element text is "+mainPagrElement.getText());
            // switching main page to parent frame 
	        
	}

}
