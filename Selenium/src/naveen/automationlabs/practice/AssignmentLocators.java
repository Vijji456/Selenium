package naveen.automationlabs.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Create an account")).click();
		//driver.switchTo().window(arg0)
		driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Selenium");
		driver.findElement(By.name("lastName")).sendKeys("NewBatch");
		driver.findElement(By.id("username")).sendKeys("seleniumnewbatch");
		driver.findElement(By.name("Passwd")).sendKeys("Sairam456");
		driver.findElement(By.className("ConfirmPasswd")).sendKeys("Sairam456");
		driver.findElement(By.linkText("Next")).click();
		
		
	}

}
