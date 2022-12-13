package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_Ex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File myFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
		 
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		// how to read whole data from Excel
		// vary rows---> vary cell
		
		// outer for loop--->rows vary from 0 to 2

		for(int i=0;i<=3;i++)
		{
			// inner for loop===> 
			
			for(int j=0;j<=2;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
