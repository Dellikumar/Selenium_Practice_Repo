package advance_Selenium_Reporting_version1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanceSeleniumReporting {
	
	
	WebDriver driver;
	@Test
	public void verifyTitle() throws InterruptedException
	{
		/*ExtentReports logger = ExtentReports.get(AdvanceSeleniumReporting.class);
		logger.init("D:\\Eclipse\\Selenium_Practice_delli\\Reports\\testexecrepots.html", true);
		logger.startTest("Advance Reporting ");
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "browser is up and running");
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		logger.log(LogStatus.INFO, "Application is up and running");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys("admin");
		logger.log(LogStatus.INFO, "Username is entereds succesfully");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		logger.log(LogStatus.INFO, "password is entered succesfull");
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Invalid username or password");
		logger.log(LogStatus.PASS, "Title is verified succesfully");
		logger.attachScreenshot("C:\\Users\\Dell-pc\\Desktop\\screenshotdemoreport.png");
		logger.endTest();*/
		
		
		
	
	}
	
	
	
	

}
