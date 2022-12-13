package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File MyFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
		 
		 String value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			
		 System.out.println(value1);
		 
		double value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(value2);
		
		boolean value3 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		
		System.out.println(value3);

	}

}
