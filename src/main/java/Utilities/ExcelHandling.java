package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	public static void main(String[] args) throws IOException  {
	FileInputStream file=new FileInputStream("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\testdata\\data.xlsx");
//	XSSFWorkbook is used to handle.xlsx files
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh= wb.getSheet("Sheet1");
	int rowcount=sh.getPhysicalNumberOfRows();//physicalnumberof row return total row count
	int colcount=sh.getRow(0).getPhysicalNumberOfCells();
	System.out.println("Total number of  rowcount"+rowcount);
	System.out.println("Total number of colcount"+colcount);

	}
	/* when we can use static keyword before static method,static variable,static block,why we are use static keyword?static keyword is use for 
	 memory management,static keyword use we can save memory
	 static variable is not related to object;it is related to class
	
	
*/
}



/* first i have to locate the excel file using fileinputstream then i have to give to the path 
  excel sheet path first go testdata than properties then get excel sheet path  when we create frame work when 
 hane to crealted package/class at src/main/java  */

// if i am not giving sheet1 then i can handle this sheet different way/answer is yes,if i use getsheetat(index number)
// if i put 0 is show first sheet1