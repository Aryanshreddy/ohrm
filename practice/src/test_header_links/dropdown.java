package test_header_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver;
		String applicationurlAddress="https://www.osmania.ac.in";

		System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.get(applicationurlAddress);
		 driver.manage().window().maximize();
		 
		 //identifying "select languages DropDown Element
		 //id="gtranslate_selector"
		 
		 WebElement selectLanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
		 
		 //<option value="">Select Language</option>
		 //<option value="en|hi">Hindi</option>
		 //<option value="en|fr">French</option>
		 //identifying the elements in the dropDown -using option tag
		 
		List<WebElement>dropdownLanguages =selectLanguagesDropDown.findElements(By.tagName("option"));

		 int dropDownListLength = dropdownLanguages.size();
		 Thread.sleep(1000);
		 System.out.println("The number of Languages in the Dropdown are:"+dropDownListLength);
		 
		 for(int i=0;i<dropDownListLength;i++)
		 {
			 String dropdownLanguage=dropdownLanguages.get(i).getText();
			 System.out.println(i+""+dropdownLanguage);
			 
			
			
			 
		 }
		 driver.quit();
		 }
		 
		 
		 

			}


