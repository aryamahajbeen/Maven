package Actions_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDetailes_pratice {
	@BeforeMethod
	void FirstTest() {
		System.out.println("hello");
	}
	@AfterMethod
	void aftermethod() {
		System.out.println("after excecuted the method");
	}
	@Test
	void SecondTest() {
		System.out.println("i am shathi");
		
	}
	@Test
	void ThirdTest() {
		System.out.println("I am 30 years old");
		
	}
	@BeforeClass
	void beforeclass() {
		System.out.println("after class");		
	}
	@AfterClass
	void afterclass() {
		System.out.println("after class");
	}
	@BeforeTest
   void beforetest() {
	  System.out.println("beforetest"); 
   }
	@AfterTest
	void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeSuite
	void beforesuit() {
		System.out.println("suit time");
		
	}
	@AfterSuite
	void aftersuit() {
		System.out.println("after suit");
		
	}
	@Test(priority=0)
	void test() {
		System.out.println("priority");
	}
	@Test(priority=2,enabled=false)
	void test5() {
		System.out.println("test5");
	}
}
