package mavenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mavepackage.Baseutil;

public class TC002_workingwithlinks extends Baseutil {

	public static void main(String[] args) {
		TC002_workingwithlinks b = new TC002_workingwithlinks();
		b.launchbrowser("chrome");
		driver.get("https://www.facebook.com/");
		
		//clicking on a link
		
		/*driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.linkText("Log In")).click();*/
        
        //Count number of links in application
      List<WebElement> links = driver.findElements(By.tagName("a"));
      links.size();
      System.out.println(links.size());
      
      //Print all the link names
      for(int i=0;i<links.size();i++) {
    	String linkname=links.get(i).getText();
    	//System.out.println(linkname);
    	//printing all the linknames that are not empty
        if(!(linkname.isEmpty())) {
      	 String linkwriting= links.get(i).getText();
      	 System.out.println(linkwriting);
        }
      }
      
      
	
	
      
      //To findout wheter the linkname is empty or not. first we have to store the link details in a variable 
      //then we can access the isempty() method.
      
      /*String linknames=driver.findElement(By.linkText("Forgot Password?")).getText();
      linknames.isEmpty();
      System.out.println(linknames.isEmpty());*/
      
      
      
	}

}
