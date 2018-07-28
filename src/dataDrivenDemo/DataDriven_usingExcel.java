package dataDrivenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xl_Read.Xls_Reader;

public class DataDriven_usingExcel {
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
		Xls_Reader read= new Xls_Reader("D:\\Eclipse\\Selenium_Practice_delli\\TestData\\ReadExcel.xlsx");
		int rows = read.getRowCount(0);
		
		Object[][] data =new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=read.getexcelData(0, i, 0);
			data[i][1]=read.getexcelData(0, i, 1);
		}
		
		return data;
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
