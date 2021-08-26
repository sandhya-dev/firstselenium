package mavenpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class windowspopup extends Baseutil {

	public static void main(String[] args) {
	 	windowspopup b = new windowspopup();
	 	
	 	//launch the browser
	 	b.launchbrowser("chrome");
	 	//launch the application
	 	//windows popup
	 	driver.get("http://www.popuptest.com/");
	 	//i want to count how my popups are open in my window
	 	
	Set<String> id=	driver.getWindowHandles();//to get how many popups are open in this windows
	id.size();
	System.out.println(id.size());
	
	Iterator<String> itr=id.iterator();
	//itr.next();//To Print the unique id's for windows
   System.out.println(itr.next());
   
   //click on a link
   driver.findElement(By.linkText("perjudian")).click();
   
   id=driver.getWindowHandles();//to get how many popups windows are open
   System.out.println(id.size());
   
   //to get the unique id for the open windows
   if(id.size()>1) {
   String mainwindow=itr.next();
   String firstpopup=itr.next();
   String secondpopup=itr.next();
   String thirdpopup=itr.next();
   
   //to close the thirdwindow popup
   driver.switchTo().window(thirdpopup);
   driver.close();
   
   driver.switchTo().window(secondpopup);
   driver.close();
   
   driver.switchTo().window(firstpopup);
   driver.close();
   
   driver.switchTo().window(mainwindow);
   driver.close();
   }
   /***
    * driver.close(); // will close the current window
    * driver.quit();  // will close all the windows everything
    */

	}

}
