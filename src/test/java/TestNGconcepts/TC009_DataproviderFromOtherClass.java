package TestNGconcepts;

import org.testng.annotations.Test;

import Dataproviderutil.Dataprovidertest;

public class TC009_DataproviderFromOtherClass {
	
	
		
		
		@Test(dataProviderClass = Dataprovidertest.class, dataProvider = "getData" )
		public void customerdetails(String firstname,String lastname,String emailid,String phoneno,String course) {
			System.out.println("Firstname : " + firstname);
			System.out.println("Lastname :" +lastname);
			System.out.println("Emailid :" + emailid);
			System.out.println("phoneno :" + phoneno);
			System.out.println("course :" + course);
			System.out.println("***************************************************************");
		
		}
}


