package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstrowoffirstcellintimeanddate {
	@Test
	public void capturingfirstrowoffirstcelldata() {
		WebDriver driver;
		String applicationurladdress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:/driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		WebElement firstrowoffirstcell_Element=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		String firstrowofcell_data=firstrowoffirstcell_Element.getText();
		System.out.println("the text of the first row o first cell value is:"+firstrowofcell_data);
		driver.quit();

		
	}

}
