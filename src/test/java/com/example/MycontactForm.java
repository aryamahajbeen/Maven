package com.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MycontactForm {
	
	@Test
	public void webtest() throws IOException {
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com");
		driver.get("https://www.mycontactForm.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		
		WebElement user=driver.findElement(By.id("user"));
		user.sendKeys("shathi");
		
	//	driver.findElement(By.id("user")).sendKeys("shathi");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("ahbe");
		WebElement marketing=driver.findElement(By.name("email_to[]"));
		marketing.click();
		WebElement subject=driver.findElement(By.id("subject"));
		subject.sendKeys("manger");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("akterf@yahoo.com");
		WebElement textbox=driver.findElement(By.id("q1"));
		textbox.sendKeys("mana");
		WebElement textmulti=driver.findElement(By.id("q2"));
		textmulti.sendKeys("Hello.i am shathi");
		WebElement dropdown=driver.findElement(By.id("q3"));
		Select sa=new Select(dropdown);
		sa.selectByVisibleText("Third Option");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='Second Option']"));
		radiobutton.click();
		WebElement checkboxsingle=driver.findElement(By.id("q5"));
		checkboxsingle.click();
		WebElement checkmulti=driver.findElement(By.xpath("//input[@value='Second Check Box']"));
		checkmulti.click();
		WebElement checkboxmulti=driver.findElement(By.xpath("//input[@value='Fifth Check Box']"));
		checkboxmulti.click();
		WebElement usstate=driver.findElement(By.id("q8"));
		Select sq=new Select( usstate);
		sq.selectByVisibleText("VA");
		List<WebElement> checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of check box is="+checkboxlist.size());
		for(int i=0;i<checkboxlist.size();i++) {
			checkboxlist.get(i).click();
		}
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of radiobutton="+radiobuttons.size());
		for(int i=0;i<radiobuttons.size();i++) {
			radiobuttons.get(i);
		
		}
			WebElement country=driver.findElement(By.id("q9"));
			Select se=new Select( country);
			se.selectByVisibleText(" United States of America");
			WebElement Candian=driver.findElement(By.id("q10"));
			Select ea=new Select(Candian);
			ea.selectByVisibleText("Quebec");
			WebElement defind=driver.findElement(By.name("q11_title"));
			Select va=new Select(defind);
			va.selectByIndex(2);
			WebElement firstname=driver.findElement(By.name("q11_first"));
			firstname.sendKeys("shathi");
			WebElement lastname=driver.findElement(By.name("q11_last"));
			lastname.sendKeys("akte");
			WebElement date=driver.findElement(By.name("q12_month"));
			Select a=new Select(date);
			a.selectByIndex(6);
			WebElement month=driver.findElement(By.name("q12_day"));
			Select f=new Select(month);
			f.selectByIndex(9);
			WebElement year=driver.findElement(By.name("q12_year"));
			Select r=new Select(year);
			r.selectByIndex(10);
			List<WebElement> link=driver.findElements(By.tagName("a"));
			System.out.print("How many are link="+link.size());
			
        //   List<WebElement> links=driver.findElements(By.id("//*[@id=\"left_col_top\"]/h5[1]"));
         //  System.out.println("how many of links="+links.size());
			
		//	TakesScreenshot src=(TakesScreenshot) driver;
		//	File mycontact=src.getScreenshotAs(OutputType.FILE);
		//	FileUtils .copyFile(mycontact, new File("C:\\Users\\akhte\\eclipse-workspace\\Example\\src\\Shathi\\SeleniumDemos\\screenshot/mycontact.jpg"));
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File contact=new File(".\\screenshots\\homepage.png");
			FileUtils.copyFile(src, contact);
			
			driver.close();
	}
	
		}

	


