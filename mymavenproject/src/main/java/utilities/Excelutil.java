package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	 private static FileInputStream ExcelFile;
	 private static FileOutputStream fileOut;
	 private static XSSFWorkbook ExcelWBook;
	 private static XSSFSheet ExcelWSheet;
	 private static XSSFCell xcell;
	 private static XSSFRow xrow;
	 
	 public static void setExcelFile(String Path,String SheetName) throws IOException {
		 
		    ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);
	 }
	 
	 public static void setCellData(String text, int rownum, int colnum) throws IOException 
	{
	     xrow  = ExcelWSheet.getRow(rownum);
	     xcell = xrow.getCell(colnum); 
	     
	     
	    if (xcell != null) 
	     {
	         xcell.setCellValue(text);
	     } 
	     else 
	     {
	          xcell = xrow.createCell(colnum);
	          xcell.setCellType(CellType.STRING);
	          xcell.setCellValue(text);  
	     }
	    
	     fileOut = new FileOutputStream(Constants.ExcelPath+Constants.Filename);
	     ExcelWBook.write(fileOut);
	     fileOut.flush();
	     fileOut.close();
 }
	 
 public static String getCellData(int rownum, int colnum) throws IOException, InvalidFormatException 
	 {
	    xrow  = ExcelWSheet.getRow(rownum);
        xcell = xrow.getCell(colnum,MissingCellPolicy.RETURN_BLANK_AS_NULL);  	     
		if(xcell!=null) {
			String celldata = xcell.getStringCellValue();
			return celldata;
		}
		else {
			return (" ");
		}
		

	        
	 }
}
