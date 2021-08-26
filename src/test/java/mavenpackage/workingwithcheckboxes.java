package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithcheckboxes extends Baseutil {

	public static void main(String[] args) {
		workingwithcheckboxes b = new workingwithcheckboxes();
		
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//label[contains(text(),'Family & Friends')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Sr. Citizen')]")).click();
		

	}

}
