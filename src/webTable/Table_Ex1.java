package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Ex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\16th_july_selenium\\\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();  // create object of chrome
		  
		  driver.manage().window().maximize();
		 
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  
		  //1) how many rows in table?
		  
		 List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		 
		 System.out.println("Total number of rows "+totalRows.size());
		 
		 // how many columns are there in table?
		 
		 List<WebElement> totalColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		 
		System.out.println("Total number of columns are "+ totalColumns.size());
		
		// how to read specific data
		
		String myData = driver.findElement(By.xpath("//table[@id='product']//tr[5]/td[2]")).getText();
		System.out.println("My data is "+myData);
		System.out.println("====================================================================");
		
		//how to read whole row by using findElements
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='product']//tr[10]/td"));
		Iterator<WebElement> it = allRows.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next().getText()+" ");
		}
		System.out.println();
		System.out.println("=========================================================================");
		
		// how to read whole row using findElement
		
		for(int i=1;i<=3;i++)
		{
		String text = driver.findElement(By.xpath("//table[@id='product']//tr[10]/td["+i+"]")).getText();
		
		System.out.print(text+" ");
		}
		

	}

}
