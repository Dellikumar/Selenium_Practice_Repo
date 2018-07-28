package listenersdemoproject;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tesstcase005()
	{
		System.out.println("Testcase 005 is passed and thread id is " +Thread.currentThread().getId());
	}
	@Test
	public void tesstcase006()
	{
		System.out.println("Testcase 006 is passedand thread id is "+Thread.currentThread().getId());
	}
	@Test
	public void tesstcase007()
	{
		System.out.println("Testcase 007 is passed and thread id is "+Thread.currentThread().getId());
	}
	@Test
	public void tesstcase008()
	{
		System.out.println("Testcase 008 is passed and thread id is "+Thread.currentThread().getId());
	}

}
