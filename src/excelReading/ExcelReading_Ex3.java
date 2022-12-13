package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File myFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
	     
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		// how to read whole row from excel
		
	System.out.println("============================================================");
		
		for(int i=0;i<=2;i++)
		{
			String value1 = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value1+" ");
		}
		  System.out.println();
		  
		  System.out.println("============================================================");
				  
		  // how to read whole column from excel
		  
		  for(int i=0;i<=2;i++)
		  {
			 String value2 = mySheet.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value2+" ");
		  }
		    System.out.println();
		    System.out.println("============================================================");
		    
		    
	 
	 
	
	 }
		

	}


