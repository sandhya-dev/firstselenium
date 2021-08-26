package mavenpackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import mavepackage.Baseutil;

public class cursormovementfromoneplacetoanother extends Baseutil {

	public static void main(String[] args) {
		cursormovementfromoneplacetoanother b = new cursormovementfromoneplacetoanother();
		//launch browser
		b.launchbrowser("chrome");
		//launch the application
		driver.get("https://www.amazon.ca/");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		
		List<WebElement> items=driver.findElements(By.xpath("//*[@id='nav-al-your-account']/a"));
		
			for(int i=0;i<items.size();i++) {
		String amazonitems=		items.get(i).getText();
		System.out.println(amazonitems);
				
			}
		}

	}


