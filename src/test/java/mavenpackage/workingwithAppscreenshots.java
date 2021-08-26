package mavenpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavepackage.Baseutil;

public class workingwithAppscreenshots extends Baseutil{

	public static void main(String[] args) throws IOException {
		workingwithAppscreenshots b = new workingwithAppscreenshots();
		
		//launch the browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//capturing screenshots
		capturescreenshots(driver,"loginpage Before entering all values");//calling the method to caprure the screenshots
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		username.sendKeys("Admin");
		capturescreenshotselement(username,"useramefield");
		password.sendKeys("admin123");
		capturescreenshotselement(password,"passwordfield");
		capturescreenshots(driver,"Loginpage after entering all values");
		loginbutton.click();
		capturescreenshots(driver,"next page");
		driver.quit();
		
		
		
	/*File srcfile=	((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile,new File("C:\\Users\\16479\\Desktop\\eclipse-workspace\\Mavenprojectid\\target\\Screenshots\\image.png"));*/

	}
public static void capturescreenshots(WebDriver driver,String filename) {
	File srcfile=	((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcfile,new File("./target/Screenshots/" + filename +".png"));
	}
	catch(IOException ioe){
		ioe.printStackTrace();
	}
}
	
	public static void capturescreenshotselement(WebElement element , String filename) {
		File srcfile=	((TakesScreenshot)(element)).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File("./target/Screenshots/" + filename +".png"));
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	

}
