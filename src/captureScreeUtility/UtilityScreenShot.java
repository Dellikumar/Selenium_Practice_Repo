package captureScreeUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class UtilityScreenShot {
	WebDriver driver;
	
	@Test
	public static String captureScreenShot(WebDriver driver, String ScreenShoName) 
	{
		
		try {
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest =new File("D:\\Eclipse\\Selenium_Practice_delli\\screenShots\\"+ScreenShoName+".png");
			Files.copy(src, dest);
			return ScreenShoName;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ScreenShoName;
	}

}
