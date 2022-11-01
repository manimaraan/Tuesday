

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tmani\\eclipse-workspace\\manimaran\\driver1\\chromedriver.exe");
	WebDriver driver1 =new ChromeDriver();
	driver1.get("https://adactinhotelapp.com/index.php");
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement user = driver1.findElement(By.cssSelector("input#username"));
	user.sendKeys("manimaran1");
	WebElement pass = driver1.findElement(By.cssSelector("[type='password']"));
	pass.sendKeys("Manimaran12345@");
	WebElement log = driver1.findElement(By.cssSelector("input.login_button"));
	log.click();
	WebElement loc = driver1.findElement(By.xpath("//select[@name='location']"));
	loc.click();
	Select ss = new Select(loc);
	ss.selectByVisibleText("Sydney");
	WebElement hotel = driver1.findElement(By.cssSelector("select#hotels"));
	hotel.click();
	Select sd = new Select(hotel);
	sd.selectByVisibleText("Hotel Creek");
	WebElement room = driver1.findElement(By.cssSelector("[name='room_type']"));
	room.click();
	Select sf = new Select(room);
	sf.selectByVisibleText("Super Deluxe");
	
	WebElement adult = driver1.findElement(By.id("adult_room"));
	adult.click();
	Select sg = new Select(adult);
	sg.selectByValue("1");
	WebElement sub = driver1.findElement(By.cssSelector("[type='submit']"));
	sub.click();
	Thread.sleep(3000);
	WebElement cc = driver1.findElement(By.cssSelector("input#radiobutton_0"));
	cc.click();
	WebElement con = driver1.findElement(By.id("continue"));
	con.click();
	WebElement first = driver1.findElement(By.cssSelector("[name='first_name']"));
	first.sendKeys("Manimaran");
	WebElement last = driver1.findElement(By.cssSelector("[name='last_name']"));
	last.sendKeys("T");
	WebElement addr = driver1.findElement(By.cssSelector("[name='address']"));
	addr.sendKeys("No:22,SV nagar,Avadi,Chennai-54");
	WebElement cred = driver1.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
	cred.sendKeys("1234567898745612");
	WebElement cred_type = driver1.findElement(By.cssSelector("[name='cc_type']"));
	Select sq =new Select(cred_type);
	sq.selectByVisibleText("American Express");
	WebElement exp = driver1.findElement(By.cssSelector("select#cc_exp_month"));
	exp.click();
	Select rr =new Select(exp);
	rr.selectByValue("1");
	WebElement year = driver1.findElement(By.cssSelector("select#cc_exp_year"));
	year.click();
	Select gg = new Select(year);
	gg.selectByValue("2022");
	WebElement cvv = driver1.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
	cvv.sendKeys("555");
	WebElement aaa = driver1.findElement(By.cssSelector("input#book_now"));
	aaa.click();
	Thread.sleep(3000);
	JavascriptExecutor jjj =(JavascriptExecutor)driver1;
	jjj.executeScript("window.scroll(0,0)","");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
