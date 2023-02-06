package com.cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebookapplication {
	@Test
	
	public void handlingcookies() {
		WebDriver driver;
		String applicationurlAddress= "https://facebook.com";
		System.setProperty("webdriver.chrome.driver","C:\\driverfiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(applicationurlAddress);
		driver.manage().window().maximize();
		
		Set<Cookie>facebookcookies=driver.manage().getCookies();
		 int cookiesCount=facebookcookies.size();
		 System.out.println("number of cookies on the facebook homepage are:-"+cookiesCount);
		 Iterator<Cookie>it=facebookcookies.iterator();
		 
		 while(it.hasNext())
		 {
			 Cookie c=it.next();
			 System.out.println("The name of the cookie is:"+c.getDomain()+""+c.getName());
		 }
		 driver.manage().deleteAllCookies();
		 facebookcookies.size();
		 System.out.println("number of cookies on the facebook home page are:="+cookiesCount);
		 
		 driver.quit();
		 }
		
	}


