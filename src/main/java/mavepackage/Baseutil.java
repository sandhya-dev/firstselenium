package mavepackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseutil {

public static 
WebDriver driver;
	 public WebDriver launchbrowser(String browsername) {
		 if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		} else if(browsername.equalsIgnoreCase("IE")) {
			DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
			 caps.setCapability("ignoreZoomSetting", true);//ignorezoomsetting in IE
			 //caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);  //create a process
			 //caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");//switches to private mode
			 caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);//ignore security setting in IE
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver(caps);
			 
			

		}else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else {
			System.out.println("Browser not found");
		}
		 //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//implicit wait
		 driver.manage().deleteAllCookies();//to delete all cookies in the browser
		 driver.manage().window().maximize();//maximizing the application
		 return driver;
	 }
	 
	 //Method overloading-polymorphism
	 /***
	  * To select the values from Dropdown based on element details passed and string value passed
	  * @param elemdetails
	  * @param value
	  */
	 public void selectvaluefromdropdown(WebElement elemdetails,String value) {
		 Select s=new Select(elemdetails);
		 s.selectByVisibleText(value);
	 }
	 
	 /***
	  * To select values from Dropdown based on element details passed on int value passed
	  * @param elemdetails
	  * @param value
	  */
	 
	 public void selectvaluefromdropdown(WebElement elemdetails,int value) {
		 Select s=new Select(elemdetails);
		 s.selectByIndex(value);
	 }
	 
	 public static boolean verifyelementpresent(String elexpath) {
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elexpath)));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true; 
	 }
	}

