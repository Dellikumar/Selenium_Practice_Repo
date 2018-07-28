import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentversionAddScreenshot3 {
	ExtentTest logger;
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\nanny.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	    logger = extent.createTest("Adding screenshot automaticaaly");
		
	}
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		Assert.assertTrue(driver.getTitle().contains("dilli"));
		System.out.println("Test is passed");
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		String temppath = Utility.getScreenShot(driver);
		logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temppath).build());
		logger.addScreenCaptureFromPath(temppath);
		}
		extent.flush();
		driver.quit();
	}
	

}
