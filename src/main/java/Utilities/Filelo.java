package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filelo {
	public static String PropertiesfileReading(String key) throws IOException  {
		Properties prop=new Properties();
		String filepath=System.getProperty("user.dir")+"//src/test//resources//configuration//develop.properties";
		FileInputStream file=new FileInputStream(filepath);
		prop.load(file);
		String value=(prop.getProperty(key));
		return value;
		
	}

}