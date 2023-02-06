package Frameoriframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationurlAddress= "https://jqueryui.com/droppable";
		System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(applicationurlAddress);
		driver.manage().window().maximize();
		
		//class="demo-frame" -properties of frame
		 WebElement frameofDragAndDropElements=driver.findElement(By.className("demo-frame"));
		 
		 //webDriver cannot directly identify any element if they are created within the frame of
		 //web application-in order to work with the elements in the frame we should first
		 //identify the frame of the web page then we should switch into the frame and then elements can be identified/recognized
		
		 driver.switchTo().frame(frameofDragAndDropElements);//switching into the frame
		 //id= "draggable"
		 WebElement dragmetomyTargetElement=driver.findElement(By.id("draggable"));
		 
		 System.out.println("dragmeTomyTargetElement is identified");
		 
		 WebElement dropHereElement=driver.findElement(By.id("droppable"));
		 //since drag and drop operation is done with the mouse using actions cass
		 
		 Actions action=new Actions(driver);
		 action.dragAndDrop(dragmetomyTargetElement,dropHereElement);
		 
		 //Perform();
		 
		 driver.switchTo().defaultContent();//switching to actual webpage
		 
		 WebElement resizable=driver.findElement(By.linkText("Resizable"));
		 resizable.click();


}

		
	}



