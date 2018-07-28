package listenersdemoproject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class VeriftTitle1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test is succesfully started andtestcase name is " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test is passsed andtestcase name is " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test is failed  andtestcase name is " +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test isskipped andtestcase name is " +result.getName());
		
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
		
	}

}
