package handlingscrolbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
	@Test
	public void scrollbarhandling()
	{
		WebDriver driver;
		String applicationurladdress="www.facebook.com";
		System.setProperty("webdriver.chrome.driver",".\\Driverfiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll, (0,900)");
		System.out.println("facebook");
		driver.close();
	}

}
