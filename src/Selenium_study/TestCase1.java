package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\16th_july_selenium\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://vctcpune.com/");
		 Thread.sleep(1000);
       //==================================================================================//
		 
		 String expectedTitle="Velocity|Best software testing course in Pune and Mumbai";
		 
		 String actualTitle=driver.getTitle();
		 
		 if(expectedTitle.equals(actualTitle))
		 {
			 System.out.println("Title is matching Test Case is Passed");
		 }
		 else
		 {
			 System.out.println("Title is not matching TestCse is Failed");
		 }
		 
		 
	}

}
