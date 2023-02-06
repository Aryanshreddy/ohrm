package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class youtube {
	WebDriver driver;
	
	@BeforeTest
	public void ApllicationLaunch()
	{
		String applicationurlAddress="https://youtube.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(applicationurlAddress);
		driver.manage().window().maximize();
	}	
	
	@Test
	public void search() throws InterruptedException {
		
		WebElement searchElement =driver.findElement(By.id("search")) ;
		
		//WebElement searchElement =driver.findElement(By.name("search_query"));
		searchElement.sendKeys("National Anthem");
		Actions action=new Actions(driver);
		
		//[performing operations on keyboard
		action.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		action.sendKeys(Keys.TAB).build().perform();
		
		action.sendKeys(Keys.ENTER).build().perform();
	

}
}