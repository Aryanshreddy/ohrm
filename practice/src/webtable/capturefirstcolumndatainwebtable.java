package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class capturefirstcolumndatainwebtable {

	WebDriver driver;//Global declaration
	@BeforeTest
	
	public void applicationLaunch()
	{
		String applicationurlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationurlAddress);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void applicationclose()
	{
		driver.close();
		
	}
	@Test
	public void firstrowoffirstcelldata()
	{
		//first row of first cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		//2nd row of firstcell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		//lostrow of firstcell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		  
		
		String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";String part2="td[1]";
		for(int i=1;i<=36;i++)
		{
			WebElement tableElement=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[\"+i+\"]/td[1]"));
			
			
			
			String data=tableElement.getText();
			System.out.println(data);
		}
}
	
	{
		
	}

}



