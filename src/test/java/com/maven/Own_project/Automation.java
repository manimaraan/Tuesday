package com.maven.Own_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Homepage;

public class Automation extends BaseClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
			
				System.getProperty("user.dir" + "//Driver//chromedriver.exe"));
		
		WebDriver driver =new ChromeDriver();
		getBrowser("chrome");
		
		geturl("http://automationpractice.com/index.php");
		
		Homepage h =new Homepage(driver);
		ClickElement(h.getSign());
		
		passValue(h.getEmail(), "tmanimaran1231@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
    
}
