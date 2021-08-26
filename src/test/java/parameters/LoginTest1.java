package parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import mavepackage.Baseutil;

public class LoginTest1 {
	
	
	WebDriver driver;
	//page objects
	By username=By.id("username");
	By password = By.id("password");
	By loginbutton=By.xpath("//button[@type='submit']");
	By signuplink=By.linkText("Sign Up");
	By Dashboardlink=By.linkText("Dashboard");
	By forgotpassword=By.linkText("Forgot username or password?");
	By LoginSOS=By.linkText("Log in with SSO");
	
	String expval="Log in to your account";
	
	
	@BeforeMethod
	public void setupTest() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();//launching the browser
	 driver.manage().deleteAllCookies();//killing all the pages
	 driver.manage().window().maximize();//maximising the window
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//holding for 20 seconds and then run
	 driver.get("https://www.surveymonkey.com/user/sign-in/");
	 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void signuplink() {
		
		Assert.assertTrue(driver.findElement(By.linkText("Sign Up")).isDisplayed());
		System.out.println(driver.findElement(signuplink));
	
		
		
	}
	
	
	@Test(priority = 2)
	public void pagetitletest() {
		String actval=driver.getTitle();
		Assert.assertEquals(actval, expval);
		System.out.println("Application title is : " + actval);
		
	}
	
	
	@Test(priority = 3)
	public void logintestpage() {
		
		driver.findElement(username).sendKeys("selenium2021");
		driver.findElement(password).sendKeys("sandhya2021");
		driver.findElement(loginbutton).click();
		Assert.assertTrue(driver.findElement(Dashboardlink).isDisplayed());
		System.out.println(driver.findElement(Dashboardlink).getText());
		
	}
	@Test(priority = 4)
	public void forgotpassword() {
		
		Assert.assertTrue(driver.findElement(forgotpassword).isDisplayed());
		System.out.println(driver.findElement(forgotpassword).getText());
	}
	@Test(priority = 5)
	public void loginSOS() {
		Assert.assertTrue(driver.findElement(LoginSOS).isDisplayed());
		System.out.println(driver.findElement(LoginSOS).getText());
		
	}
	
	

}
