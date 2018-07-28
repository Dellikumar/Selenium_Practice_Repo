package advanceReporting_version2;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentTest;

public class AdvanceVersion3 {
	
	@Test
	public void generateReport() throws IOException
	{
		/*ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\dilli123456.html");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		com.aventstack.extentreports.ExtentTest logger=extent.createTest("verify llogin");*/
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\dilli123456.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		com.aventstack.extentreports.ExtentTest logger = extent.createTest("login demo test");
		logger.log(Status.INFO, "now im little bit clear in reporting");
		logger.fail("this is failing continuously", MediaEntityBuilder.createScreenCaptureFromPath("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\verifyTitle.png").build());
		logger.pass("passing", MediaEntityBuilder.createScreenCaptureFromPath("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\verifyTitle.png").build());
		
		logger.log(Status.INFO, "test is running");
		logger.log(Status.INFO, "abotto run");
		logger.log(Status.PASS, "ststusi is passed");
		logger.fail("it is failed ", MediaEntityBuilder.createScreenCaptureFromPath("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\verifyTitle.png").build());
		logger.pass("it is passed ", MediaEntityBuilder.createScreenCaptureFromPath("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\verifyTitle.png").build());
		com.aventstack.extentreports.ExtentTest logger2=extent.createTest("verify llogin");
		logger2.log(Status.INFO, "test is running");
		logger2.log(Status.INFO, "abotto run");
		logger2.log(Status.PASS, "ststusi is passed");
		extent.flush();
		
	}

}
