package com.maven.Own_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionss extends BaseClass{
public static void main(String[] args) throws AWTException  {
	getBrowser("chrome");
	geturl("http://www.amazon.in/");
	window("Maximize");
	WebElement best = driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_bestsellers']"));
	Actions a =new Actions(driver);
	a.contextClick(best).build().perform();
	Robot rr = new Robot();
	rr.keyPress(KeyEvent.VK_DOWN);
	rr.keyRelease(KeyEvent.VK_DOWN);
	rr.keyPress(KeyEvent.VK_ENTER);
	rr.keyRelease(KeyEvent.VK_ENTER);
}
}
