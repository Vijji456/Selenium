package naveen.automationlabs.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandlings {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Create an account")).click();
		Set <String>handler=driver.getWindowHandles();
		Iterator <String>it=handler.iterator();
		String ParentwindowID=it.next();
		System.out.println(ParentwindowID);
		String ChildWindowId=it.next();
		System.out.println(ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
	}

}
