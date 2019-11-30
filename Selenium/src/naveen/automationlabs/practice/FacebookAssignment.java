package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\Selenium\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_l")).sendKeys("Selenium");
	driver.findElement(By.name("lastname")).sendKeys("NewBatch");
	driver.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys("8123807302");
	driver.findElement(By.cssSelector("#u_0_x")).sendKeys("Sairam456");
	
	Select select=new Select(driver.findElement(By.id("day")));	
	select.selectByIndex(23);;
	Select select1=new Select(driver.findElement(By.id("month")));	
	select1.selectByVisibleText("Jan");
	Select select2=new Select(driver.findElement(By.id("year")));	
	select2.selectByValue("1991");
	
	
		
	
	
	
	}

}
