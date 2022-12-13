package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		    WebDriver driver=new ChromeDriver();
		    
	    driver.manage().window().maximize();
		    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(1000);
	  //============================================================================    
       WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
                  dropdown.click();
     
             //2--create object of Select class
                 Select s=new Select(dropdown);
            //=======================================================================
	            s.selectByValue("option1");
	            Thread.sleep(1000);
	       //=========================================================================
	            s.selectByIndex(3);
	            Thread.sleep(1000);
	       //=========================================================================
	            s.selectByVisibleText("Select");
	            
	      //==========================================================================
	         
	            System.out.println(s.getFirstSelectedOption().getText());
	            System.out.println("Multiple selectable status is "+s.isMultiple());
	            
	}

}
