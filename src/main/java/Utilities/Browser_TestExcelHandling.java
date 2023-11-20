package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Browser_TestExcelHandling {//sep14
	public static String[]excelData()throws IOException{
		
		FileInputStream file= new FileInputStream("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\testdata\\BrowserTest.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		System.out.println(wb.getNumberOfSheets());
		XSSFSheet sh=wb.getSheet("Sheet1");
		int Rowcount=sh.getPhysicalNumberOfRows();
		int Colcount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Rowcount="+Rowcount);
		System.out.println("Colcount="+Colcount);
		
		String[]data=new String[Rowcount];
		for(int r=0;r<Rowcount;r++) {
		//	for(int c=0;c<Colcount;c++) {
			//	System.out.println(sh.getRow(r).getCell(c).getStringCellValue()+" ");
				data[r]=sh.getRow(r).getCell(0).getStringCellValue();
			
			
		}
		return data;
	}	
	}//Very first i need to created a class where i wrote my excel it is inside the ststic method
//it is return array after that i need to created a testcase(browser_testExcelhandlingtestcase)

	
	


