package advanceReporting_version2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import captureScreeUtility.UtilityScreenShot;

public class AdvanceSeleniumReporting {
	
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest logger;
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		 reports =new ExtentReports("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\Advanceexecrepots.html");
		 logger=reports.startTest("VerifyTitle");
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "browser is up and running");
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		logger.log(LogStatus.INFO, "Application is upand running");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		logger.log(LogStatus.PASS, "login is done succesful");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("ramu"),"Invalid username or password");
		
		
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String ScreenshotName = UtilityScreenShot.captureScreenShot(driver, result.getName());
			String Screenimg = logger.addScreenCapture(ScreenshotName);
			logger.log(LogStatus.FAIL, "verifyTitle", Screenimg);
		}
		reports.endTest(logger);
		reports.flush();
		
		driver.get("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\Advanceexecrepots.html");
	}
	
	/*@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	 
	String screenshot_path=Utility.captureScreenshot(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title verification", image);
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
	driver.get("C:\\Report\\LearnAutomation.html");
	}
	*/
	
	
	

}
