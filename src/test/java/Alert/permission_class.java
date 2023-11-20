package Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permission_class {
	public static void main(String[]args) {
		ChromeOptions options=new ChromeOptions();//classoptions
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	}

}
