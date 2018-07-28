package dataDrivenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	
	
	@Test(dataProvider="enterData")
	public void loginDemo(String username, String passsword) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(passsword);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Invalid username or password");
		System.out.println("User is succesfully logged into the application");
		
	}
	@DataProvider(name="enterData")
	public Object[][] passData()
	{
		Object[][] data =new Object[3][2];
		data[0][0] ="admin123";
		data[0][1] ="demo12";
		
		data[1][0] ="admin";
		data[1][1] ="demo123";
		
		data[2][0] ="admin123456";
		data[2][1] ="demo1245";
		return data;
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
