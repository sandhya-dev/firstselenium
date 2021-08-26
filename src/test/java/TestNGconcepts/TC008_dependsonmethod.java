package TestNGconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008_dependsonmethod {
	@Test(priority = 1)
	public void login() {
		System.out.println("loginTest");
		Assert.assertEquals("Book","BookTickets");
	}
	@Test(priority = 2,dependsOnMethods = "login")
	public void Booktickets() {
		System.out.println("BookTickets");
		Assert.assertTrue(false);
	}
	@Test(priority = 3,dependsOnMethods = {"login","Booktickets"})
	public void logout() {
		System.out.println("logout");
		
	}

}
