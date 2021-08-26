package mavenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mavepackage.Baseutil;

public class TC003_workingwithimages extends Baseutil {

	public static void main(String[] args)  {
		TC003_workingwithimages b=new TC003_workingwithimages();
		//launch browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		//count  all the images
	List <WebElement> images =	driver.findElements(By.tagName("img"));
		int totalimages = images.size();
		System.out.println("Total no of images in Scotia are:" + totalimages);
		
		//print all the image links
		
		for(int i=0;i<images.size();i++) {
	String imagesamazon	=images.get(i).getAttribute("src");
	System.out.println(imagesamazon);
			
		}

	}

}
