package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); // object of chrome driver
		
	//	driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		// how to get size  
		Dimension defaultsize = driver.manage().window().getSize();
		
       System.out.println(defaultsize);
       
     // to set the size ,we need to create object of Dimension class and pass width and height
       
       Dimension d=new Dimension(1200,252);
       
       // by using dimension object set the size using setSizeMethod
       Thread.sleep(1000);
       
       driver.manage().window().setSize(d);
     //=================================================================================  
       
 // to set the size ,we need to create object of Dimension class and pass width and height
       
       Dimension d1=new Dimension(1200,252);
       
       // by using dimension object set the size using setSizeMethod
       Thread.sleep(1000);
       
       driver.manage().window().setSize(d1);
	}

}
