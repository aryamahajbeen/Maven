package Utilities;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.BaseUI;

public class Listeners  implements ITestListener{
	public static ExtentReports extent;
	public static ExtentTest logger;
	//getting extent report instance on start of test class
	public void onStart(ITestContext testContext) {
		extent= ExtenReportManager.getReporInstance();
	}
	//creating test in extent report on start of each test
	public void onTestStart(ITestResult result) {
		logger=extent.createTest(result.getName());
		BaseUI.logger=logger;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		String testname =result.getName();
		String filePath="C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\Screenshot2\\"+testname+"passed.png";
		try {
			BaseUI.screenShot(filePath);
			logger.log(Status.PASS,"Snapshot attached:"+logger.addScreenCaptureFromPath(filePath));
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
	//	logger.log(Status.FAIL,result.getThrowable());
		String testname =result.getName();
		String filePath="C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\Screenshot2\\"+testname+"passed.png";
		BaseUI.screenShot(filePath);
		
		logger.log(Status.FAIL,"Actual result"+logger.addScreenCaptureFromPath(filePath));

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
		

		String testname =result.getName();
		String filePath="C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\Screenshot2\\"+testname+"passed.png";
	//	BaseUI.screenShot(filePath);
	//	logger.log(Status.SKIP,"Actual result"+logger.addScreenCaptureFromPath(filePath));
		BaseUI.logger=logger;

	}

	@Override
	public void onFinish(ITestContext context) {
 //   System.out.println("test finished");
    extent.flush();
	}

}
