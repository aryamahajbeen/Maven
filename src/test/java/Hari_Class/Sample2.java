package Hari_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	@BeforeMethod
	public void Mymethod2() {
		System.out.println("I am sahthi");
	}
	@Test
	public void mymethod() {
		int a=4;
		int b=6;
		System.out.println(a+b);
				
	}
	@AfterMethod
	public void mymethod5() {
		System.out.println("My name last name is akhter");
	}

}
