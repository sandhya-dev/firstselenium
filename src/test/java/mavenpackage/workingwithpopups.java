package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithpopups extends Baseutil {

	public static void main(String[] args) {
		workingwithpopups b = new workingwithpopups();
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://the-internet.herokuapp.com/upload");
		//uploading file into the application
		/***
		 * using sendkeys() command we can upload a file in selenium
		 */
		driver.findElement(By.id("file-upload")).sendKeys("‪C:\\Users\\16479\\Pictures\\calendar.JPG‪");
        driver.findElement(By.id("file-submit")).click();
	}

}
