package mavenpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithalertsorpopups extends Baseutil {

	public static void main(String[] args) throws InterruptedException {
		workingwithalertsorpopups b = new workingwithalertsorpopups();
		
		//launch browser
	 b.launchbrowser("chrome");
	 //launch the application
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
	 //driver.findElement(By.name("login")).sendKeys("sandhya");
	// driver.findElement(By.id("password")).sendKeys("welcome1234");
	 driver.findElement(By.name("proceed")).click();
	 
	 //to goto alert from your application
	 
	 Alert alert=driver.switchTo().alert();//to goto alert from your application
	String alertvalue= alert.getText();//to capture text in alert
	System.out.println(alertvalue);
	
	Thread.sleep(3000);
	
	alert.accept();//to click on Ok button in alert
	//alert.dismiss();//to click on cancel or escape key in keyboard
	

	}

}
