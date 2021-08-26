package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mavepackage.Baseutil;

public class workingwithwaits extends Baseutil{

	public static void main(String[] args) {
		workingwithwaits b = new workingwithwaits();
		//launch the browseer
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.awwwards.com/sites/khoa-le");
		System.out.println("Application title is:" + driver.getTitle());
		
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[2]/strong[1]/a[1]")).click();
		
		//explicit wait
		
		/*WebDriverWait wait=new WebDriverWait(driver,30);//explicit wait webdriverwait class
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("_username")));//until username is visible
		wait.until(ExpectedConditions.presenceOfElementLocated((By.name("_username"))));//username is present on page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[5]/div[2]/div[1]/iv[1]/div[1]/div[1]/form[1]/p[1]/button[1]")));//until login button is visible*/
		if (verifyelementpresent(("//input[@name='_username']"))) {
			driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("xyzveluru");
		}
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
