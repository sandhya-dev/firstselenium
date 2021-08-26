package TestNGconcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderconcept {
	
	//step 2.create a method with arguments
	@Test(dataProvider = "getData")//step 3. give the dataprovider annotation and method name
	public void customerdetails(String firstname,String lastname,String emailid,String phoneno,String course) {
		System.out.println("Firstname : " + firstname);
		System.out.println("Lastname :" +lastname);
		System.out.println("Emailid :" + emailid);
		System.out.println("phoneno :" + phoneno);
		System.out.println("course :" + course);
		System.out.println("***************************************************************");
	
	}
	
	
	//step 1.define the dataprovider
	@DataProvider
	public Object getData() {
		
		Object details[][]= new Object[2][5];
		//1.customer
		details[0][0]="sandhya";
		details[0][1]="veluru";
		details[0][2]="bwrani@gmail.com";
		details[0][3]="6479784336";
		details[0][4]="selenium";
		
		//2.customer
		
		details[1][0]="Ravi";
		details[1][1]="Gopineedi";
		details[1][2]="rvg@gmail.com";
		details[1][3]="6479784336";
		details[1][4]="Java";
		
		return details;
	}

}
