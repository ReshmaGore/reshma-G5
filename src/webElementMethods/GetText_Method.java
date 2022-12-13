package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetText_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\16th_july_selenium\\\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();  // create object of chrome
		  
		  driver.manage().window().maximize();
		  
		    driver.get("https://vctcpune.com/selenium/practice.html");
		           Thread.sleep(1000);
	//======================================================================
		           
		         //1st way
		        // String myText = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
		        
		        // System.out.println("text is "+myText);
 //=========================================================================================        
		        //2nd way
		       
		//  System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());
  //==========================================================================================================
		        //3rd way
		        WebElement myElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		        
		        System.out.println(myElement.getText());
    
	}

}
