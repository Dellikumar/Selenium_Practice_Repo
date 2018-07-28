package xl_Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	FileInputStream fis;
	XSSFWorkbook wb;
	
	
	public Xls_Reader(String filepath)
	{
		try {
			File src = new File(filepath);
			 fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getexcelData(int sheetindex, int rowno , int cellno)
	{
		XSSFSheet sheet1 =wb.getSheetAt(sheetindex);		
		String data =sheet1.getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetindex)
	{
		int rowCount = wb.getSheetAt(sheetindex).getLastRowNum();
		rowCount=rowCount+1;
		System.out.println("No of rows is "+rowCount );
		return rowCount;
	}

}
