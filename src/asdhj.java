import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import captureScreeUtility.UtilityScreenShot;
import xl_Read.Xls_Reader;

public class asdhj {

	public static void main(String[] args) throws Exception {
		/*
		File src = new File("D:\\Eclipse\\Selenium_Practice_delli\\TestData\\ReadExcel.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		System.out.println("No of rows is "+rowCount);
		rowCount=rowCount+1;
		
		for(int i=0;i<rowCount;i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();	
			System.out.print(data);
			
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();	
			System.out.println("    "+data1);
			
		}
		
		FileOutputStream fout= new FileOutputStream(src);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		sheet1.getRow(2).createCell(2).setCellValue("pass");
		wb.write(fout);
		
		wb.close();
		
		
		//String data = sheet1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(data);
		
*/		
		Xls_Reader read = new Xls_Reader("D:\\Eclipse\\Selenium_Practice_delli\\TestData\\ReadExcel.xlsx");
		
		System.out.println(read.getexcelData(0, 4, 1));
		
	}


		
	
	}
