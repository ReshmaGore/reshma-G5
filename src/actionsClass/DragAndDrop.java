package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
          driver.manage().window().maximize();
          
          driver.get("https://demoqa.com/droppable/");
          Thread.sleep(1000);
           
          Actions act=new Actions(driver);
          
        WebElement Drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
          
         WebElement Drop = driver.findElement(By.xpath("(//p[text()='Drop here'])[1]"));
         
         act.dragAndDrop(Drag, Drop).perform();
         
	}

}
