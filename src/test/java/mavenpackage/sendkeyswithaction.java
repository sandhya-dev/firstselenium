package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import mavepackage.Baseutil;

public class sendkeyswithaction extends Baseutil{

	public static void main(String[] args) throws InterruptedException {
		sendkeyswithaction b = new sendkeyswithaction();
		//launch the browser
		b.launchbrowser("chrome");
//launch the application
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		//sendkeyswithactions class
		
		Actions actions=new Actions(driver);
		driver.findElement(By.id("username"));
		actions.sendKeys(driver.findElement(By.id("username")), "selenium2021").build().perform();
		actions.sendKeys(driver.findElement(By.id("password")), "sandhya2021").build().perform();
		Thread.sleep(4000);
		//click on login button
		actions.click(driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button"))).build().perform();
	}

}
