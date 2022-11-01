package com.maven.Own_project;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass extends BaseClass{
	public static void main(String[] args) throws IOException {
		getBrowser("Chrome");
		geturl("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		passValue(email, "tmanimaran99@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		passValue(pass, "hjhajbhjshugc13161");
		
		WebElement click = driver.findElement(By.name("login"));
		
		ClickElement(click);
		screenshot("Maran");
		
		driver.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
    
    
    

}
