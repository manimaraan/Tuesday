package com.maven.Own_project;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	
	public static void passValue(WebElement ele,String email) {
		ele.sendKeys(email);
	}
	
	public static void ClickElement(WebElement ele) {
		ele.click();
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	
	public static void getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		}
		else {
			System.out.println("Enter the correct browser name:");
		}
	}
	
	public static void screenshot(String a) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\tmani\\eclipse-workspace\\Own_project\\Glory\\"+a+".png");
		FileUtils.copyFile(Source, destination);
	}
	
	public static void action(String actionName, WebElement element) {
		Actions a =new Actions(driver);
		if (actionName.equalsIgnoreCase("Clickon")) {
			a.click(element).build().perform();
		}
			else if (actionName.equalsIgnoreCase("Doubleclick")) {
				a.doubleClick(element).build().perform();
				
			}
			else if (actionName.equalsIgnoreCase("Moveto")) {
				a.moveToElement(element).build().perform();
			}
		}
	public static void window(String element) {
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}

}
