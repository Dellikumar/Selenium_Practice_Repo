package webTables;

import java.util.List;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Delli_Selenium_Practice\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.freecrm.com/index.html?e=2");
		 driver.findElement(By.name("username")).sendKeys("naveenk");
		 driver.findElement(By.name("password")).sendKeys("test@123");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement e= driver.findElement(By.xpath("//input[@type='submit']"));
		 js.executeScript("arguments[0].click();", e);
		
		 Thread.sleep(3000);
		 WebElement e1=driver.findElement(By.xpath("//*[@title='Contacts']"));
		 js.executeScript("arguments[0].click();", e1);
		 Thread.sleep(3000);
		 
		//form[@id='vContactsForm']//table[@class='datacard']
		 
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
		 
		 
		//*[@id="vContactsForm"]/table/tbody/tr[24]/td[2]/a
		 String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		 String after_xpath="]/td[2]/a";
		 
		 for(int i=4;i<=24;i++)
		 {
			String  name = driver.findElement(By.xpath(before_xpath + i +after_xpath)).getText();
			
			//*[@id='vContactsForm']/table/tbody/tr[5]/td[1]/input
			System.out.println(name);
			 if(name.contains("aaa ccc"))
			 {
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click(); 
			 }
		 }
		 
		 
		 
		 
			
	}
	}
