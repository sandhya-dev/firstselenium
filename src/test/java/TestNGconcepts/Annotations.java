package TestNGconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
		
	}
	
    @BeforeMethod
	public void Beforemethod() {
		System.out.println("Beforemethod");
	}
    @AfterMethod
    public void Aftermethod() {
    	System.out.println("Aftermethod");
    }
    @org.testng.annotations.BeforeTest
    public void BeforeTest() {
    	System.out.println("BeforeTest");
    }
    @org.testng.annotations.AfterTest
    public void AfterTest() {
    	System.out.println("AfterTest");
    }
    @Test
    public void booktickets() {
    	System.out.println("Book tickets");
    }
    @Test
    public void canceltickets() {
    	System.out.println("Canceltickets");
    }
}
