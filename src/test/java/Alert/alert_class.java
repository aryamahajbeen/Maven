package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_class {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		// we cant directly open the ok button
		Thread.sleep(3000);//wait time 
	//	driver.switchTo().alert().accept();
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	//	driver.switchTo().alert().dismiss();
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	
	Alert alertwindow	=driver.switchTo().alert();
	System.out.println("The message display on alert"+alertwindow.getText());
	alertwindow.sendKeys("Welcome");
	alertwindow.accept();
		
	}

}
