package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

     File myFile=new File("D:\\apacheFiles\\practice Sheet 1.xlsx");
     
     Workbook myWorkbookFactory = WorkbookFactory.create(myFile);
     Sheet mySheet = myWorkbookFactory.getSheet("Sheet1");
     Row myRow = mySheet.getRow(0);
     Cell myCell = myRow.getCell(4);
     CellType myType = myCell.getCellType();
     System.out.println(myType);
     
    System.out.println( myCell.getNumericCellValue());
     
   //  System.out.println(myWorkbookFactory);

	}

}
