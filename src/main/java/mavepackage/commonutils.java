package mavepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonutils {
//1.define webdriver here
	WebDriver driver;
	
//2.creating a constructor
	public commonutils(WebDriver driver) {
		//3.passing local variable to constructor class
		this.driver=driver;
	}
//4.generic method for all webelements(button,input,checkbox,table)
	//wrapper
	public WebElement getelement(By locator) {
		//5.
	WebElement element	=driver.findElement(locator);
	//6. Returning element from the method to use it in someother place
	return element;
	}
	
	
	//method to click on button
	/***
	 * This method can be used when we want to click on any button
	 * @param locator
	 */
	
	public void clickonbutton(By locator) {
		try {
			getelement(locator).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("some exception occurred while clicking on an element");
		}
	}
	
	
	//method to enter values in input fields
	/***
	 * This method used when we want to enter the values inside input field
	 * @param locator
	 * @param value
	 */
	
	public void entervaluesInInputfields(By locator,String value) {
		try {
			getelement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("some exception occurred while entering values in input fields.....");
		}
	}
	
}
