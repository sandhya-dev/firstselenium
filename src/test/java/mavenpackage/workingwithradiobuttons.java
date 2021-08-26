package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithradiobuttons extends Baseutil {

	public static void main(String[] args) {
		workingwithradiobuttons b = new workingwithradiobuttons();
		
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//label[text()='Multicity']")).click();
		

	}

}
