package base;

import java.io.File;

import org.apache.commons.io.FileUtils;		//10/5
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utilities.DataUtils;

public class BaseUI {//oct5
	public static WebDriver driver;// this driver initialize(meaning start),we need to connect with our test calass
	public static String timestamp=DataUtils.getTimestamp();//that why i created setdriver
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static void setDriver(WebDriver driver) {//creater a seter
		BaseUI.driver=driver;
	}
	public static void screenShot(String filePath) {//first we need to created a screenshoot codes
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File(filePath)); 
		}catch(Exception e) {
			e.printStackTrace();
		}
			//after we creating the BaseUI i am calling this class to listener
		}
	
	}


