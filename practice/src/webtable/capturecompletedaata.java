package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class capturecompletedaata {
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
	public void Capturingfirstrowoffirstcelldata()
	{
		//first row of first cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		//2nd row of firstcell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		//lostrow of firstcell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		String XpathExpressionpart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String XpathExpressionpart2="]/td[";
		String XpathExpressionpart3="]";
		  
		for(int i=1;i<=36;i++)//will go to all the rows
		  {
			  for(int j=1;j<8;j++)
			  {
				  
				  WebElement WebtableElement=driver.findElement(By.xpath(XpathExpressionpart1+i+XpathExpressionpart2+j+XpathExpressionpart3));
				  String WebtableData=WebtableElement.getText();
				  		
				  System.out.print(WebtableData+"  ");
						  
			  }
			 System.out.println();
				  		
			  }
				  
			  }
		  
}


