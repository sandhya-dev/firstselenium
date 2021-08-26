package smokesuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertions {

String course1="selenium",course2="selenium";
int no1=10,no2=10;
boolean status1=true,status2=true;

@Test(priority = 1)
public void verifyingvalues() {
	Assert.assertEquals(course1, course2);
	Assert.assertEquals(no1, no2);
	Assert.assertEquals(status1, status2);
	Assert.assertTrue(status1);
	
	Assert.assertTrue(false, "*************Button not found*************");
	System.out.println("Logout");
	
}
@Test(priority = 2)
public void displaymessage() {
	System.out.println("sandhya");
}

}
