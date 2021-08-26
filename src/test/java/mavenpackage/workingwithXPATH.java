package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;
/***
 * <input name="txtUsername" id="txtUsername" type="text">
 *tagnames-Input,button,a,table,span,strong,select
 *Attributename-name,id,type,value,class
 */
// XPATH SYNTAX---> //tagname[@attributename='attributevalue']
// Example 1: using single attribute
//tagname[@attributename='attributevalue']
//------>//input[@id='txtUsername']---->xpath

public class workingwithXPATH extends Baseutil{

	public static void main(String[] args) {
		workingwithXPATH b = new workingwithXPATH();
		//launch browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//example 2: creating xpath with 2 attributes
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//syntax for xpath using 2 attributes
		//tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2']
		//tagname[@attributename1='attributevalue1' or @attributename2='attributevalue2']
		
		//input[@id='txtPassword' and @type='password'] //syntax for 2 attributes
		//input[@id='txtPassword' or @type='password']
		driver.findElement(By.xpath("//input[@id='txtPassword' and @type='password']")).sendKeys("admin123");
		

 
	}

}
