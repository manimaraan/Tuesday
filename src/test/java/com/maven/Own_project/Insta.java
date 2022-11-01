package com.maven.Own_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insta extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		getBrowser("Chrome");
		geturl("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']"));
		ClickElement(sign);
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("emailOrPhone"));
		passValue(email, "manimaran99@gmail.com");
		WebElement name = driver.findElement(By.name("fullName"));
		passValue(name, "Virat kohli");
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.name("username"));
		passValue(user, "__manimaran__102");
		
		WebElement pass = driver.findElement(By.name("password"));
		passValue(pass, "CustomerPoint123@");
		Thread.sleep(2000);
        WebElement log = driver.findElement(By.xpath("(//button[@class='_acan _acap _acas'])[2]"));
        log.click();
//		WebElement bday = driver.findElement(By.xpath("//select[@title='Month:']"));
//		Select ss = new Select(bday);
//		ss.selectByValue("4");
//		
//		WebElement dob = driver.findElement(By.xpath("//select[@title='Day:']"));
//		Select sd = new Select(dob);
//		sd.selectByValue("3");
//		WebElement dff = driver.findElement(By.xpath("//select[@title='Year:']"));
//	    Select sf =new Select(dff);
//	    sf.selectByValue("2017");
	}

}
