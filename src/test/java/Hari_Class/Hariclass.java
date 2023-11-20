package Hari_Class;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Hariclass {
	WebDriver driver = null;
	@Test
	public void start() {
		WebDriver driver;
		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	



	@Test(priority=0)
	@Parameters({"firstname","lastname"})

	public void browser(String first,String last) {
		
	

	//	driver.get("https://demo.automationtesting.in/Register.html");
	//Thread.sleep(2000);
	driver.manage().window().maximize();
	//Thread.sleep(2000);
//	driver.manage().window().minimize();
//	Thread.sleep(2000);
//	driver.manage().window().fullscreen();//esc meaning fullscreen
//	Thread.sleep(2000);
	WebElement firstname =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys(" ");
	WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys("last");
	WebElement address =driver.findElement(By.xpath("//textarea[@rows='3']"));
	address.sendKeys("4090 lakes mill dr");
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("acde@gamil.com");
	
	WebElement phone =driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("3655002");
	WebElement gender=driver.findElement(By.xpath("//label[normalize-space()='FeMale']"));
	gender.click();
//	driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
   List	<WebElement> hobbies=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("Total number of cheekbox"+hobbies.size());
	for(int i=0;i<hobbies.size();i++) {
		hobbies.get(i).click();
	}

	
	WebElement skill=	driver.findElement(By.id("Skills"));
		
	Select s=new Select(skill)	;
	s.selectByIndex(9);

  WebElement year=	driver.findElement(By.id("yearbox"));
	Select a=new Select(year);
	a.selectByIndex(6);
	WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select v= new Select(month);
	v.selectByIndex(9);
	WebElement day=driver.findElement(By.id("daybox"));
	Select w= new Select(day);
	w.selectByVisibleText("19");
	WebElement password=driver.findElement(By.id("firstpassword"));
	password.sendKeys("mn205");
	WebElement confirmpass=driver.findElement(By.id("secondpassword"));
	confirmpass.sendKeys("mn205");
	WebElement Refresh=driver.findElement(By.id("Button1"));
	Refresh.click();
//	WebElement submit=driver.findElement(By.id("submitbtn"));
//	submit.click();
	driver.close();
	//another way we can do select class like
	/*
	 Select s =new Select(driver.findElement(By.xpath("")));
	 s.selectext
	 s.select value
	 s.select index
	 */
	}
	// new meaning create an instance of the class
    }


	

