package mavenpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavepackage.Baseutil;

public class workingwithTables extends Baseutil{

	public static void main(String[] args) throws InterruptedException {
		workingwithTables b = new workingwithTables();
		//launch browser
		b.launchbrowser("chrome");
		//launch application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login name and password click on loginbutton
		/* Actions actions = new Actions(driver);
		 actions.sendKeys(driver.findElement(By.id("txtUsername")),"Admin").build().perform();
		 Thread.sleep(3000);
		 actions.sendKeys(driver.findElement(By.id("txtPassword")), "admin123").build().perform();
		 Thread.sleep(3000);
		 actions.click(driver.findElement(By.id("btnLogin"))).build().perform();
		 Thread.sleep(3000);*/
		String explastname="Patel";
	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		
		//clicking on PIM menu
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//1.Get appropriate Xpath
		//2.count number of rows in that table
	List<WebElement> tablerows=	driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td[4]/a"));
	tablerows.size();
	System.out.println("Total number of rows in table :"+tablerows.size());
		//3.Go to the specific column
		//4.Extract the values from every row
	for(int i=0;i<tablerows.size();i++) {
	String lastname=	tablerows.get(i).getText();
	System.out.println("lastname values:"+lastname);
	if(explastname.equalsIgnoreCase(lastname)) {
		System.out.println("lastname is Matching");
		
		break;
	}else {
		System.out.println("lastname is Missing");
		
	}
	
	}
		 
		

	}

}
