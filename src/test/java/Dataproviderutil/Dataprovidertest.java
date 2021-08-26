package Dataproviderutil;

import org.testng.annotations.DataProvider;

public class Dataprovidertest {
	
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
