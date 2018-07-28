import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility {
	
	
	public static String getScreenShot(WebDriver driver)
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/Screenshotsnew/"+System.currentTimeMillis()+".png";
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			System.out.println("capture failed"+e.getMessage());
		}
		return path;
		
	}

}
