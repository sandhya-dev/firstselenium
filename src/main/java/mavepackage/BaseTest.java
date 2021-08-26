package mavepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public void openapplication() {
		
		Properties prop = new Properties();
		
		try {
			FileInputStream file=new FileInputStream("./config/Application.properties");//Location of your properties file
			prop.load(file); //to load the properties file
			String browsername=prop.getProperty("browsername"); //To capture browsername from properties file
			//chrome
			if (browsername.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				//IE
			} else if(browsername.equalsIgnoreCase("IE")){
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                //FireFox
			}else if(browsername.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else {
				System.out.println("No browser found");
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
