package TestNGconcepts;

import org.testng.annotations.Test;

//No main in testng
//every method should be written inside method
//In Testng every method is a non static method
//@Test to execute any test
public class TC001_firsttestngcode {
@Test
	public void displaymessage() {
		System.out.println("We are Learning Test NG ");
	}
@Test
public void displayname() {
	System.out.println("Sandhya Reddy veluru");
}

}
