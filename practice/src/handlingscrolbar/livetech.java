package handlingscrolbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class livetech {
@Test
	
	public void scrollbarHandling()
	{
		WebDriver driver;
       String applicationurlAddress="https://www.livetech.in";
       		
		
		System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(applicationurlAddress);
		
		//driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,9000)");
		System.out.println("livetech");
		
		
	}

}
