package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithIE extends Baseutil{

	public static void main(String[] args) {
		workingwithIE b=new workingwithIE();
		//launch the browser
		b.launchbrowser("IE");
		
		//launch the application
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		System.out.println("Application title name:" + driver.getTitle());
		System.out.println("Application URL :" + driver.getCurrentUrl());
		
		
		
	}

}
