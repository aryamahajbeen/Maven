				package base;

import org.openqa.selenium.WebDriver; //this class  setup class this class commen for every testcase
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
	public static WebDriver getFireFoxDriver() {
		WebDriver driver=new FirefoxDriver();
		return driver;
		
	}
	
public static WebDriver getChromeDriver() {
	WebDriver driver=new ChromeDriver() ;
		return driver;
	}

public static WebDriver getEdgeBrowser() {
	WebDriver driver=new FirefoxDriver() ;
		return driver;
	}
	
}



