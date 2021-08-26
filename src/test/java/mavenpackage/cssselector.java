package mavenpackage;

import mavepackage.Baseutil;

public class cssselector extends Baseutil {

	public static void main(String[] args) {
		
		//<input type="text" id="username" name="username" value="" autocorrect="off" autocapitalize="off" 
		//class="notranslate required sm-input sm-input--stretch error" maxlength="50" size="20" autofocus="" xpath="1">
		
		// .notranslate.required.sm-input.sm-input--stretch --->css selector for a class
		
		//id----> #
		//#username
		
	//using xpath	//input[@id='username']
		/*usingcss----> input#username
		               input[id=username]
		               input[name=username]*/
		
		cssselector b = new cssselector();
		//launch browser
		b.launchbrowser("chrome");
		//launch the browser
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		
		
	}

}
