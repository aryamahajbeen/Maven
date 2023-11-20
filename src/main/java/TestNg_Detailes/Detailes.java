package TestNg_Detailes;

public class Detailes {
	/* testng is a testing framework inspire from Junit and NUnit but introduction  some new 
	 * functionalities that make it more powerful and eaier to use
	 * testng is designed to cover all categories of test,unit,funtional,end to end,integration,etc
	 * 
	 * advantages of testng,manges test suites and test cases,helps in prioritizing of test,helps in grouping of test,
	 * parallel execution,reporting
	 * ID=intellij
	 * testng we dont have main method,testng we need mainten suite like this=testSuite contain multipul test case
	 * inside the test cases has test steps=TestSuite--TestCase--TetSteps
	 * java package come under testSuite which contain number of classe and every class contain one test case inside the 
	 * class allthe test steps including as a different type of method and every method is a test method
	 * TestSuite--TestCase--TestSteps
	 * Package--Classes--Method
	 * by defult testng Exceuted by alphbetical order if i want to control the the order then i have to ues
	 * priority=0,priority=1,priority
	 * priority make exceuted order or proper order which ever number come first it is exceuted first
	 * if i use assert.equales(1:2,1:3)it is not equal that why it is going to fail
	 * what is annotation=we can control the sequence and pirority of the method which allows to execute java
	 * code before and after a certain point
	 * annotations are placecd over the method with the symbol@
	 *  @beforesuilte=@aftersuite//@beforetest=@aftertest//@beforeclass=@afterclass//@beforemethod=@atermethod
	 *  suite contain=test,test contain=classes ,classes contian=class ,class contain method
	 *  @BeforeTest it exceuted before all the test and @Aftertest it exceuted when all the test are done
	 *  @BeforeSuit and AfterSuit before actual test is start aftersuit is exceuted after actual test is done
	 *  
	 *  //@test
	 *  @beforemethod=is excecuted multipule time before start actual test is excecuted
	 *  @aftermethod =is exceuted after comeplete of the Test case
	 *  @beforeclass=meaning it is exceuted before class and @Afterclass=is when is exceuted entire method then that method exceuted
	 *  @beforeclass and afterclass exceuted one time before class exceuted and afterclass is exceuted one time too
	 *  Suit contain multiple test
	 *  if i want to a test method disable foe thar resons i have to put paremiter like(enabled=false)that method not exceuted at run time
	 *  Dependency TesNG=is when we created multipule  method on test case they will a dependency on other method
	 *  Dependency syntax=(dependsonMethod={"driverCar"})//(DependsonMethods={"driver",stopCar},alwaysRun=true
	 *  if dependence method is fail still if i want exceuted method in that case we can use always run method
	 *  it going to be exceuted
	 *  gropeing=
	 *  
	 *  Assert is class=//assert.assertTrue()Assert.assertFalse()//assert.assertEquals()
	 *  when we have a group put name test
	 *  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="Testcase.App"/>
      <class name="Testcase.Testcase2"/>
      <class name="Testcase.ScrollDemo"/>
      <class name="Testcase.Reading"/>
      <class name="Testcase.Test_Fectory"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 *  
	 *  
	 *  
	 */

}
