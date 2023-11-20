package Actions_class;

import org.testng.annotations.Test;

public class TestNG_Dependence {
	
	@Test(groups= {"sanity"})
	void startcar() {
		System.out.println("car stast");
	}
	@Test(groups= {"regression"})
   void drived() {
	   System.out.println("car drived");
   } 
	@Test(groups= {"sanity"})
   void stop() {
	   System.out.println("car stop");
   }
}
