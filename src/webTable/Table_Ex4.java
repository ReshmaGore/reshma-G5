package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Ex4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\16th_july_selenium\\\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();  
		  
		  driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 
		  List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		 
		 for(WebElement t:table)
		 {
			 System.out.println(t.getText()+" ");
			 System.out.println();
		 }
		 
		 
		 

	}

}
