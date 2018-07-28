package runnerdemofailed;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class Runner {

	public static void main(String[] args) {
     
		 TestNG tng = new TestNG();
		 List suites = Lists.newArrayList();
		 suites.add("D:\\Eclipse\\Selenium_Practice_delli\\test-output\\Suite\\testng-failed.xml");
		
		 tng.setTestSuites(suites);
		 tng.run();
	}

}
