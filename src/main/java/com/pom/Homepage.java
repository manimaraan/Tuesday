package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign;
	
	@FindBy(xpath="(//input[@data-validate='isEmail'])[1]")
	private WebElement email;
	

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getSign() {
		return sign;
	}

	public Homepage(WebDriver abc) {
		this.driver =abc;
		PageFactory.initElements(driver, this);
}
}