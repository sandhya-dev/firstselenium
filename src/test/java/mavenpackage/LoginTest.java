package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;
import mavepackage.commonutils;

public class LoginTest extends Baseutil{

	public static void main(String[] args) {
		LoginTest b = new LoginTest();
		//7.launch browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		//8.creating reference for commonutils.java
		
		commonutils util=new commonutils(driver);
		
		By username=By.id("username");
		By password=By.id("password");
		By loginbutton=By.xpath("//button[@type='submit']");
		
		//9.Enter login credentials
		/*util.getelement(username).sendKeys("selenium2021");
		util.getelement(password).sendKeys("sandhya2021");
		util.getelement(loginbutton).click();*/
		
		util.entervaluesInInputfields(username, "selenium2021");
		util.entervaluesInInputfields(password, "sandhya2021");
		util.clickonbutton(loginbutton);
		

	}

}
