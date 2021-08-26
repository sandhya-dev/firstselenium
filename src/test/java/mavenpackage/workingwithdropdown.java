package mavenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import mavepackage.Baseutil;

public class workingwithdropdown extends Baseutil {

	public static void main(String[] args) throws InterruptedException {
		workingwithdropdown b = new workingwithdropdown();
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		
		driver.get("https://www.olg.ca/en/home.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='login-button-sign-up-register']")).click();
		
		driver.findElement(By.id("lh-pre-email")).sendKeys("bwrani@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='lh-start-button']")).click();
		Thread.sleep(4000);
		//selecting values from dropdown
		
		//driver.findElement(By.id("dateofBirth-select-month")).sendKeys("Jun");
		driver.findElement(By.id("firstName")).sendKeys("sulochana");
		driver.findElement(By.id("middleName")).sendKeys("pa");
		driver.findElement(By.id("lastName")).sendKeys("perugu");
		driver.findElement(By.id("username")).sendKeys("sulochana");
		driver.findElement(By.id("password")).sendKeys("Dharnija@50");
		
		//using Select class selecting day
		Select s1=new Select(driver.findElement(By.id("dateOfBirth-select-date")));
		s1.selectByValue("19");
		
		//select class month
		
		//Select s2 = new Select(driver.findElement(By.id("dateOfBirth-select-month")));
		//s2.selectByVisibleText("Jun");
		
		//printing the dropdown values without select class
		
		List<WebElement> monthval=	driver.findElements(By.xpath("//*[@id='dateOfBirth-select-month']/option"));
		System.out.println(monthval.size());
		
		for(int i=0;i<monthval.size();i++) {
			String monthname=monthval.get(i).getText();
			System.out.println(monthname);
			if(monthname.equals("Jun")) {
				monthval.get(i).click();
				break;
			}
			
		}
		
		//using select class selecting year
	
		
		Select s3= new Select(driver.findElement(By.id("dateOfBirth-select-year")));
		s3.selectByIndex(102);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='accountInfo']/form/fieldset/button")).click();
		
//capture all the values from dropdown or to get the count from dropdown or date size of the dropdown
	List<WebElement> dateval=	s1.getOptions();
	System.out.println("size of the date: " + dateval.size());
	
	
	//capture the size of the month in dropdown
	/*List<WebElement> monthval = s2.getOptions();
	System.out.println("size of the month:" + monthval.size());
	//to get all your month names
	for(int i=0;i<monthval.size();i++) {
		String monthname=monthval.get(i).getText();
		System.out.println("monthnames are:" + monthname);
	}*/
	
	//capture the size of the year in dropdown
	
	List<WebElement> yearval = s3.getOptions();
	System.out.println("size of the year in dropdown :" + yearval.size());
		
		
	}

}
