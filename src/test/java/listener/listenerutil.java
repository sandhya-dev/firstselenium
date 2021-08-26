package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerutil implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test executed:" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*********************Test passed*************** :" + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println("Test fail : " + result.getName());
		System.out.println("Status of the test is:" + result.getStatus());
		System.out.println(result.getThrowable().getMessage());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	
	

	

	

	

	

}
