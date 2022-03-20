package com.trainermngmt.utility;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility1 {
		private static XSSFWorkbook excelWBook; //Excel WorkBook
	    private static XSSFSheet excelWSheet; //Excel Sheet
	   
	  public static String getCellData(int RowNum, int ColNum) throws IOException {
	      
	        // Open the Excel file
	    FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources" + "/Logindata.xlsx");
	    excelWBook = new XSSFWorkbook(ExcelFile);
	    excelWSheet = excelWBook.getSheetAt(0);
	    return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	    }
}
