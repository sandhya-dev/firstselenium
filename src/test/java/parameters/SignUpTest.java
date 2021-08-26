package parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {
	
	 WebDriver driver;

	By signupbutton=By.linkText("Sign Up");
	By loginsso=By.linkText("Log in with SSO");
	
	
	@Test
	@BeforeMethod
	@Parameters({"url"})
	public void setup(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void signup() throws InterruptedException {
		Assert.assertTrue(driver.findElement(signupbutton).isDisplayed());
		Assert.assertTrue(driver.findElement(loginsso).isDisplayed());
		driver.quit();
	
	}


	
	
}
