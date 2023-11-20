package Utilities;







import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseUI;



public class  ExtenReportManager {//oct12
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	public static ExtentReports getReporInstance() {
		extent=new ExtentReports();//objact of extent class
		String repName="TestReort"+BaseUI.timestamp+".html";//repname is report name
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//report//"+"repName");
		extent.attachReporter(reporter);//user.dir is my projact path the save my repor to particuler folder
		extent.setSystemInfo("OS",System.getProperty("os.name"));
		extent.setSystemInfo("User Name","shathi");
		extent.setSystemInfo("Application Name", "My contact from");
		extent.setSystemInfo("Application Version", "1.0");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("contact Form-Founctional Test");
		reporter.config().setTheme(Theme.DARK);
		return extent;
		
		// i need i give a path where my report need to save----every time i want new report i dont want my repor replace
		//that why i need to created a new class name datautlis
		//extend class attach to the path of the reporter
	}
	
	

	
	// we need create new class dataUtils
	//projact we need to open new folder reports

}
