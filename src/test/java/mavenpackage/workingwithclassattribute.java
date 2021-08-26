package mavenpackage;

import org.openqa.selenium.By;

import mavepackage.Baseutil;

public class workingwithclassattribute extends Baseutil{

	public static void main(String[] args) {
		workingwithclassattribute b = new workingwithclassattribute();
		//launch the browser
		b.launchbrowser("chrome");
		
		//launch the application
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		
		driver.findElement(By.id("username")).sendKeys("selenium2021");
		//driver.findElement(By.xpath("//input[@id='username' and contains(@class,'sm-input')]")).sendKeys("selenium2021");
		driver.findElement(By.id("password")).sendKeys("sandhya2021");
		//clicking on login button using class attribute with Xpath and contains
		
		//wds-button wds-button--stretch wds-button--icon-right wds-button--arrow-right
		
		//button[contains(@class,'wds-button--stretch')]--->xpath using class attribute
		
		driver.findElement(By.xpath("//button[contains(@class,'wds-button--stretch')]")).click();
		
		
		 //can we use contains with 2 attributes
		//<input type="text" id="username" name="username" value="" autocorrect="off" autocapitalize="off" 
		//	class="notranslate required sm-input sm-input--stretch error" maxlength="50" size="20" autofocus="">
		
		//syntax for contains with 2 attributes
		
		//tagname[@attributename='attributevalue' and contains(@attributename,'attributevalue')]
		
		//input[@id='username' and contains(@class,'sm-input')]
		
		
		//contains with text
		//tagname[contains(text(),'Log in with SSO')
		//a[contains(text()='Log in with SSO')]
		
		//contains with index
	//	(//tagname[contains(@attributename,'attributevalue')])[1]
	//	 (//input[contains(@class,'sm-input')])[1]
		
		//position
		//	 (//input[contains(@class,'sm-input')])[position()=1]
		
		
		
		//using text directly without contains
		//a[text()='Log in with SSO']
		
		//strong[text()='Log in with your Office 365, LinkedIn, Facebook, Google, or Apple Account']

	}

}
