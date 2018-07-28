package unTrustedCert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestDemo {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void handleCertiicate()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.gecko.driver","D:\\Delli_Selenium_Practice\\geckodriver.exe");
		driver = new FirefoxDriver(cap);
		driver.manage().window().maximize();
		driver.get("http://www.cacert.org/");

	}

}
