package neoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Utility
{
	// commonly used methods
	
	// screenshot,wait,scrolling into view,excel reading etc
	
	public static  String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
		
		Reporter.log("reading data from excel", true);
		return value;
	}
	
	public static void screenshot(WebDriver driver, String ScreenShotName) throws IOException
	{        wait(driver, 500);
		     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     File destination=new File("D:\\screenshots"+ScreenShotName+".png");
			 FileHandler.copy(src, destination);
			 Reporter.log("taking screenshot", true);
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{        wait(driver, 500);
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView(true)", element);
		    Reporter.log("Scrolling into view", true);
	}
	
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("Wating for"+waitTime+"ms", true);
	}
	

}
