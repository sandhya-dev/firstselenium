package TestNGconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import mavepackage.Baseutil;

public class TC003_Loginintosurveymonkeyapplications extends Baseutil{
	Baseutil b = new Baseutil();
	
	By username=By.id("username");
	By password=By.id("password");
	By loginbutton=By.xpath("//button[@type='submit']");
	By dashboardlink=By.linkText("Dashboard");
           
	
	@Test(priority = 1)
	public void launchapplication() {
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		//delete the cookies
		driver.manage().deleteAllCookies();
	}
	@Test(priority = 2)
	public void loginintoapplication() {
		driver.findElement(username).sendKeys("selenium2021");
		driver.findElement(password).sendKeys("sandhya2021");
		driver.findElement(loginbutton).click();
		driver.findElement(dashboardlink).click();
		String expval="Dashboard";
		String actval=driver.findElement(dashboardlink).getText();
		
		Assert.assertEquals(actval, expval);
		/*//check in if it login successfully
		String expval="Dashboard";
		String actval=driver.findElement(dashboardlink).getText();
		if(actval.equalsIgnoreCase(expval)) {
			System.out.println("entered into the dasborad");
		}else {
			System.out.println("failed to load");
		}*/
	
	}
	@Test(priority = 3 )
	public void logout() {
		driver.quit();
	}
	
}
