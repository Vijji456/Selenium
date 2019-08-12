package naveen.automationlabs.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Create an account")).click();
		//driver.switchTo().window(arg0)
		Set <String> handler=driver.getWindowHandles();
		Iterator <String> it=handler.iterator();
		String ParentWindowid=it.next();
		System.out.println("Id of parent is:"+ParentWindowid);
		String ChildWindowId=it.next();
		System.out.println("Id of child is:"+ChildWindowId);
		driver.switchTo().window(ChildWindowId);
		driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Selenium");
		driver.findElement(By.name("lastName")).sendKeys("NewBatch");
		driver.findElement(By.id("username")).sendKeys("seleniumnewbatch");
		driver.findElement(By.name("Passwd")).sendKeys("Sairam456");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Sairam456");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Next")).click();
		
		
	}

}
