package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingLoop {
	public static void main(String[] args) throws IOException {
		
		FileInputStream files=new FileInputStream("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\testdata\\ExcelSingle.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(files);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int Rowcount=sh.getPhysicalNumberOfRows();
		int Colcount=sh.getRow(0).getPhysicalNumberOfCells();
	//	System.out.println(sh.getRow(5).getCell(0).getStringCellValue());
		for(int r=0;r<Rowcount;r++) {
			
		
		System.out.println(sh.getRow(r).getCell(0).getStringCellValue());
	}
	}
}
