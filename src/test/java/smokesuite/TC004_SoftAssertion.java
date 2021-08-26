package smokesuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC004_SoftAssertion {
	
	
	
	String course1="selenium" , course2="selenium";
	int no1=10,no2=20;
	boolean status1=true,status2=true;


@Test
public void verifyvaluesusingassertions() {
	
	SoftAssert sa = new SoftAssert();
	
	sa.assertEquals(status1, status2);
	sa.assertEquals(no1, no2);
	System.out.println("***********continue*********");
	sa.assertEquals(course1, course2);
	Assert.assertFalse(true);
	System.out.println("continue2");
	sa.assertFalse(true);
	sa.assertFalse(false,"******link is missing*******");
	sa.assertAll();
	
}
}
