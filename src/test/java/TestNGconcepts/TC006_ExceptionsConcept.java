package TestNGconcepts;

import org.testng.annotations.Test;

public class TC006_ExceptionsConcept {
	/*@Test(expectedExceptions = ArithmeticException.class)
	public void Arthimeticoperations() {
		System.out.println("Beginning of arthimetic operation");
		int a=9/0;
		System.out.println("End of arthimetic operation");
	}
	
	@Test(expectedExceptions = Exception.class)//generic exception when we dont know which exception it will throw
	public void Arthimeticoperations1() {
		System.out.println("Beginning of arthimetic operation");
		int a=9/0;
		System.out.println("End of arthimetic operation");
	}*/
	
	@Test(expectedExceptions = {ArithmeticException.class,ArrayIndexOutOfBoundsException.class,NullPointerException.class} )
	public void multipleexception() { //when we want to give multiple exceptions
		//int a =9/0;
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		a[2]=30;
	}


}
