package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavepackage.Baseutil;

public class workingwithframes extends Baseutil {

	public static void main(String[] args) {
		workingwithframes b=new workingwithframes();
		
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//to tell which frame we have to capture
		
		
		//capturing the draggable text
	String dragtext=	driver.findElement(By.id("draggable")).getText();
	System.out.println(dragtext);
	
	//capturing the drop text
String droptext=	driver.findElement(By.id("droppable")).getText();
System.out.println(droptext);

//Actions
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop=driver.findElement(By.id("droppable"));
Actions actions=new Actions(driver);
actions.dragAndDrop(drag, drop).build().perform();

//clicking on a link
/***
 * to get the cursor from out of the frame use defaultcontent()
 */
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Selectable")).click();
	

	}

}
