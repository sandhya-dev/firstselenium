package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mavepackage.Baseutil;

public class Base extends Baseutil {

	public static void main(String[] args) throws InterruptedException {
//working with Input fields		
Base launch = new Base();
//launching the browser
launch.launchbrowser("chrome");
//launching the application
driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
//get the title
System.out.println(driver.getTitle());

//working with input fields
//How do we enter values in application
/*driver.findElement(By.id("username")).sendKeys("sandhyaveluru");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("welcome1234");
Thread.sleep(2000);
driver.findElement(By.id("username")).clear();
Thread.sleep(2000);
driver.findElement(By.id("password")).clear();
Thread.sleep(2000);
driver.findElement(By.id("username")).sendKeys("training1");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("welcome");*/

WebElement username = driver.findElement(By.name("username"));
WebElement password = driver.findElement(By.name("password"));
username.sendKeys("sandhyaveluru");
Thread.sleep(2000);
password.sendKeys("welcome1234");
Thread.sleep(2000);
username.clear();
Thread.sleep(2000);
username.sendKeys("training");
password.clear();
Thread.sleep(2000);
password.sendKeys("welcome");

//capture the value that is entered in input field
String userval=username.getAttribute("value");
System.out.println("value entered in username field is :" + userval);
String passval=password.getAttribute("value");
System.out.println("password entered is:" + passval);

//verify the username entered is correct or not

/*if (userval.equalsIgnoreCase("training")) {
	System.out.println("pass");
} else {
	System.out.println("Fail");

}*/

if(userval !=null) {
	System.out.println("Pass");
}else {
	System.out.println("Fail");
	
}







	}
	
}


