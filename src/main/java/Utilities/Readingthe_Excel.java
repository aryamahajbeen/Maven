package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readingthe_Excel {
	
	public static String[][]excldata() throws IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\testdata\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int Rowcount=sh.getPhysicalNumberOfRows();
		int Colcount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total number of rowcount="+Rowcount);
		System.out.println("Total number of colcount="+Colcount);
		String[][] data=new String[Rowcount][Colcount];
		for (int i = 0; i <Rowcount; i++) {
			for (int j = 0; j <Colcount; j++) {
			data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();	
				
			}// if i want to print the we need to open the another class i have to make a claa inside same package
			
		}
		return data;
	}

}
