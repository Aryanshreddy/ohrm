package test_header_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testheaderlinksofapsrtc {

	public static void main(String[] args) {
WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.tsrtconline.in");
//maximizing the browser
driver.manage().window().maximize();
//Identifying the headerBlock
//class="menu wrap"
WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
//going to header block and finding all the elements of header block
List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
//finding the size of the Array list
int headerBlokLinks_size=headerBlockLinks.size();
//printing the size of the array list-all the elements stored in the Array list
System.out.println("The number of webElements in the HeaderBlok RE:"+headerBlokLinks_size);
//Loop to test all the Elements of the heaerBlock
for(int i=0;i<headerBlokLinks_size;i++)
{
	//going to the array list,going to the every index of Array list and getting the text of the element stored
	String headerLinkName=headerBlockLinks.get(i).getText();
	//printing the index of the Array list along with the link name
	System.out.println(i+""+headerLinkName);
	//going to the array list to every index of the Array list and clicking to test link
	headerBlockLinks.get(i).click();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println();
	driver.navigate().back();
	headerBlock=driver.findElement(By.className("menu-wrap"));
	headerBlockLinks=headerBlock.findElements(By.tagName("a"));
}
//driver.quit();
	}
}
	
	


	


	


