package Utilities;

import java.io.IOException;
import java.util.Iterator;

public class Readingthe_ExcelTesting {
public static void main(String[] args) throws IOException {
	String[][] data=Readingthe_Excel.excldata();
	

	for (int i = 0; i < data.length; i++) {
		
	for (int j = 0; j < data[0].length; j++) {
		System.out.println(data[i][j]);
	}	
	}
}
}