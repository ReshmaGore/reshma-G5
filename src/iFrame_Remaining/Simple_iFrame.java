package iFrame_Remaining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_iFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();  // object of Chrome driver
	      
	      driver.manage().window().maximize();
	      driver.get("https://www.w3schools.com/");
	      Thread.sleep(1000);
	  WebElement text  = driver.findElement(By.xpath("//h1[text()='HTML']"));
	       System.out.println(text.getText());
	      

	}

}
