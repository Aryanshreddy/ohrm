package testng;

import org.testng.annotations.Test;

public class Annotations1 {
@Test(priority=1)//it represents test case
public void applicationlaunch()
{
	System.out.println("gmail application launch successifully");
}
@Test(priority=2)
public void inbox()
{
	System.out.println("gmail application inbox functionality test successifull");
}
@Test(priority=3)
public void composemail() {
	System.out.println("gmail application compose functionality test successifull");
}
@Test(enabled=false)
public void drafts()
{
	System.out.println("gmail application drafts functionalit test successiully");
	
}
}
