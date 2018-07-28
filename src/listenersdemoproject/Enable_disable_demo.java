package listenersdemoproject;
import org.testng.annotations.Test;

public class Enable_disable_demo {
	
	@Test(groups={"smoke"})
	public void tesstcase001()
	{
		System.out.println("Testcase 001 is passed");
	}
	
	@Test(groups={"reg"})
	public void tesstcase002()
	{
		System.out.println("Testcase 002 is passed");
	}
	@Test(groups={"smoke"})
	public void tesstcase003()
	{
		System.out.println("Testcase 003 is passed");
	}
	@Test(groups={"reg"})
	public void tesstcase004()
	{
		System.out.println("Testcase 004 is passed");
	}
	@Test(groups={"smoke"})
	public void tesstcase005()
	{
		System.out.println("Testcase 005 is passed");
	}
	@Test(groups={"reg"})
	public void tesstcase006()
	{
		System.out.println("Testcase 006 is passed");
	}

}
