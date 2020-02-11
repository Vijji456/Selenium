package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Vijjii");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test@123");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		
		
		
		  driver.switchTo().frame("mainpanel"); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 
	
		 
		
		
	/*	  driver.switchTo().frame("leftpanel");
		  Thread.sleep(3000);
		 // driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		  driver.findElement(By.linkText("Alerts")).click();
		 // Thread.sleep(3000);
		 
		
		
		//driver.quit();
*/		
		
			
	}

}
