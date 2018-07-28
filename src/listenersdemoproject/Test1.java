package listenersdemoproject;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void tesstcase001()
	{
		System.out.println("Testcase 001 is passed and thread id is " +Thread.currentThread().getId());
	}
	@Test
	public void tesstcase002()
	{
		System.out.println("Testcase 002 is passed and thread id is " +Thread.currentThread().getId());
	}
	@Test
	public void tesstcase003()
	{
		System.out.println("Testcase 003 is passed and thread id is " +Thread.currentThread().getId());
	}
	@Test
	public void tesstcase004()
	{
		System.out.println("Testcase 004 is passed and thread id is " +Thread.currentThread().getId());
	}

}
