package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoVeiw {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // object of chrome driver
		
	//	driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		WebElement hideButton = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		// scrolling into view
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollintoView(true)", hideButton);
		
		System.out.println(hideButton.getText());

	}

}
