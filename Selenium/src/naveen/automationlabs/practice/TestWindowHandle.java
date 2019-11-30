package naveen.automationlabs.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWindowHandle {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentId=it.next();
		System.out.println("ParentID: "+parentId);
		
		
		
		String childId=it.next();
		System.out.println("ChildID: "+childId);
		
		driver.switchTo().window(childId);
		System.out.println("Title of child window: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println("Title of parent window: "+driver.getTitle());
		
		
		
		
		
		
		
	}

}
