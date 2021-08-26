package RegressionSuite;

import org.testng.annotations.Test;

public class TC002_Testcasespriority {
	@Test(priority = 1)
	public void login() {
		System.out.println("login into the application");
	}
	@Test(priority = 2)
	public void booktickets() {
		System.out.println("booking the tickets");
	}
	@Test(priority = 3)
	public  void logout() {
		System.out.println("logout from the application");
	}

}
