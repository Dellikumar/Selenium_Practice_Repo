import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import captureScreeUtility.UtilityScreenShot;

public class Test1 {
	WebDriver driver;
	@Test
	public void loginDemo() throws InterruptedException, IOException
	{
		
		/*ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\ramu.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("my practicetest report");
		logger.log(Status.INFO,"Browser is about to up and run");*/
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		String temp=Utility.getScreenShot(driver);
		//logger.log(Status.INFO,"Application is up and running as per expected");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		//logger.log(Status.PASS, "username and password is entered succesfully and login is done");
		Thread.sleep(5000);
		/*UtilityScreenShot.captureScreenShot(driver, "demo123");
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Invalid username or password");
		System.out.println("User is succesfully logged into the application");*/
		
		//logger.fail("The titleverification is failed....",MediaEntityBuilder.createScreenCaptureFromPath("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\verifyTitle.png").build());
		//extent.flush();
		
		
	}
	

}
