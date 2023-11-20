package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingPractice {
	public static void main(String[] args) throws IOException{
		FileInputStream files=new FileInputStream("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\testdata\\book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(files);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount =sh.getPhysicalNumberOfRows();
		int colcount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Rowcount="+rowcount);
		System.out.println("Colcount="+colcount);
	//	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		for(int i=0;i<rowcount;i++) {
			for(int c=0;c<colcount;c++) {
				System.out.println(sh.getRow(i).getCell(c).getStringCellValue()+" ");//concat
			}
			System.out.println();
		}
	}

}
