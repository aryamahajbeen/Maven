package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="classpath:/features",glue="cucumber_step")
public class cucumber extends AbstractTestNGCucumberTests {

}
