package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mavepackage.Baseutil;

public class workingwithdropdownusingmethods extends Baseutil{
  
	public static void main(String[] args) throws InterruptedException {
		workingwithdropdownusingmethods b=new workingwithdropdownusingmethods();
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
		
		
		//driver.findElement(By.id("dateofBirth-select-month")).sendKeys("Jun");
		driver.findElement(By.id("firstName")).sendKeys("sulochana");
		driver.findElement(By.id("middleName")).sendKeys("pa");
		driver.findElement(By.id("lastName")).sendKeys("perugu");
		driver.findElement(By.id("username")).sendKeys("sulochana");
		driver.findElement(By.id("password")).sendKeys("Dharnija@50");
		
		//selecting values from dropdown
		//we can declare as a variable and put in the arugments passing
		WebElement monthname=driver.findElement(By.id("dateOfBirth-select-month"));
  WebElement year		=driver.findElement(By.id("dateOfBirth-select-year"));
  WebElement   date =driver.findElement(By.id("dateOfBirth-select-date"));
		//for the value we can give the month,date,year like this
		
		String dob="19-Jun-1987";
	String	splitdob[]=dob.split("-");
	//splitdob[0]=19
	//splitdob[1]=Jun
	//splitdob[2]=1987
		b.selectvaluefromdropdown(monthname, splitdob[1]);
		b.selectvaluefromdropdown(year, splitdob[2]);
		b.selectvaluefromdropdown(date, splitdob[0] );
		
		//selecting values for dropdown
		/*b.selectvaluefromdropdown(driver.findElement(By.id("dateOfBirth-select-month")), "Jun");
		b.selectvaluefromdropdown(driver.findElement(By.id("dateOfBirth-select-date")), "19");
		b.selectvaluefromdropdown(driver.findElement(By.id("dateOfBirth-select-year")), 102);*/

		
	}

}
