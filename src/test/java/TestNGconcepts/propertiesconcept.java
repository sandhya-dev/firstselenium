package TestNGconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import mavepackage.BaseTest;

public class propertiesconcept extends BaseTest {
	/*@Test
	public void verifyingproperties()  {
		Properties prop = new Properties();
		
			
				
				try {
					FileInputStream file= new FileInputStream("C:\\Users\\16479\\Desktop\\eclipse-workspace\\Mavenprojectid\\config\\Application.properties");
					prop.load(file);
					
			String name = prop.getProperty("name");
			String emailid = prop.getProperty("emailid");
			System.out.println("Name is:*************** " + name + " Email Address is:***********" + emailid);
					
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}*/
	
	@Test
	public void setup() {
		BaseTest b = new BaseTest();
		b.openapplication();
	}
}
