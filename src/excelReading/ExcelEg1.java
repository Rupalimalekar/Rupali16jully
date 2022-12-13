package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

   File myfile = new File("D:\\poiFiles\\poi-bin-5.2.3-20220909\\New XLSX Worksheet.xlsx");
   
         String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    	System.out.println(value1);
		
		
        String value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();		
	      System.out.println(value2);
	
	   
	String value3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value3);
		
		
	 String value4 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value4);
		
		String value5 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(value5);
		
		
		
		
	}

}
