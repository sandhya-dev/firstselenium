package TestNGconcepts;

import org.testng.annotations.Test;

public class TC007_Invocationconcept {
	
	
	@Test(invocationCount = 10)
	public void login() {
		System.out.println("LoginTest");
	}

}
