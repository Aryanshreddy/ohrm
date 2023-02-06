package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void applicationlaunch()
	{
System.out.println("gmail application launch successifully");
}
@Test(priority=1)
public void inbox()
{
	System.out.println("gmail application inbox functionality test successifull");
}
@Test(priority=0)
public void composemail() {
	System.out.println("gmail application compose functionality test successifull");
}
@Test(enabled=false)
public void drafts()
{
	System.out.println("gmail application drafts functionalit test successiully");
	
}
@AfterTest
public void applicationclose()
{
	System.out.println("closing gmail application");
}
}


	


